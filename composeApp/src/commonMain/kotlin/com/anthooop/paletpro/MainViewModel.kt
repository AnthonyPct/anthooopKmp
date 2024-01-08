package com.anthooop.paletpro

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import com.anthooop.paletpro.core.domain.repository.AuthenticationRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class MainViewModel(
    private val authenticationRepository: AuthenticationRepository
) : ScreenModel {

    ///////////////////////////////////////////////////////////////////////////
    // COMPANION
    ///////////////////////////////////////////////////////////////////////////

    companion object {
        private const val TAG = "MainViewModel"
    }

    ///////////////////////////////////////////////////////////////////////////
    // DATA
    ///////////////////////////////////////////////////////////////////////////

    // GET flow data with onboarding
    val appState: StateFlow<OnBoardingState> =
        authenticationRepository.isConnected().map {
            OnBoardingState.Success(false, it)
        }
            .stateIn(
                scope = screenModelScope,
                started = SharingStarted.WhileSubscribed(),
                initialValue = OnBoardingState.Loading,
            )

}

sealed class OnBoardingState {
    data object Loading : OnBoardingState()
    data class Success(val completed: Boolean, val isConnected: Boolean) : OnBoardingState()
}
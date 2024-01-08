package com.anthooop.paletpro.core.data.repository

import com.anthooop.paletpro.core.domain.repository.AuthenticationRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class AuthenticationRepositoryImpl(
    // TODO : inject firebase API or Preferences manager
) : AuthenticationRepository {

    ///////////////////////////////////////////////////////////////////////////
    // PUBLIC API
    ///////////////////////////////////////////////////////////////////////////

    override fun isConnected(): Flow<Boolean> {
        return flowOf(false)
    }
}
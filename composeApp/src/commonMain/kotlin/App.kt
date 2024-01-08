import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.anthooop.paletpro.MainViewModel
import com.anthooop.paletpro.OnBoardingState
import com.anthooop.paletpro.core.ui.theme.PaletProTheme
import com.anthooop.paletpro.feature.authentication.LoginScreen
import com.anthooop.paletpro.feature.dashboard.DashboardScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.KoinContext
import org.koin.compose.koinInject

@Composable
fun App(
    mainViewModel: MainViewModel = koinInject()
) {

    val appState = mainViewModel.appState.collectAsState().value

    KoinContext {
        PaletProTheme {
            when (appState) {
                is OnBoardingState.Success -> {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background,
                    ) {
                        Navigator(
                            screen = if (!appState.isConnected) LoginScreen() else DashboardScreen(),
                            content = { navigator ->
                                ProvideAppNavigator(
                                    navigator = navigator,
                                    content = { SlideTransition(navigator = navigator) },
                                )
                            }
                        )
                    }
                }

                else -> {
                    // Nothing
                }
            }
        }
    }
}

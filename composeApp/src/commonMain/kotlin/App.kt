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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.anthooop.paletpro.MainViewModel
import com.anthooop.paletpro.core.ui.theme.PaletProTheme
import com.anthooop.paletpro.feature.authentication.LoginScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.KoinContext
import org.koin.compose.koinInject

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App(
    mainViewModel: MainViewModel = koinInject()
) {
    KoinContext {
        PaletProTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background,
            ) {
                Navigator(
                    screen = LoginScreen(),
                    content = { navigator ->
                        ProvideAppNavigator(
                            navigator = navigator,
                            content = { SlideTransition(navigator = navigator) },
                        )
                    }
                )
            }

        }
    }
}

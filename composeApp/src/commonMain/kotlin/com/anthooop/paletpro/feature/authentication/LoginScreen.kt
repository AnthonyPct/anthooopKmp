package com.anthooop.paletpro.feature.authentication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.anthooop.paletpro.feature.dashboard.DashboardScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.koin.core.component.KoinComponent

class LoginScreen : Screen, KoinComponent {

    ///////////////////////////////////////////////////////////////////////////
    // LIFECYCLE
    ///////////////////////////////////////////////////////////////////////////

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                navigator.push(DashboardScreen())
            }) {
                Text("Click me!")
            }
        }
    }
}


//var showContent by remember { mutableStateOf(false) }
//
//Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//    Button(onClick = { showContent = !showContent }) {
//        Text("Click me!")
//    }
//    AnimatedVisibility(showContent) {
//        Column(
//            Modifier.fillMaxWidth(),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Image(painterResource("compose-multiplatform.xml"), null)
//        }
//    }
//}
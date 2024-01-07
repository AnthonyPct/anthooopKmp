package com.anthooop.paletpro.feature.dashboard

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import org.koin.core.component.KoinComponent


class DashboardScreen : Screen, KoinComponent {

    ///////////////////////////////////////////////////////////////////////////
    // LIFECYCLE
    ///////////////////////////////////////////////////////////////////////////

    @Composable
    override fun Content() {
        Text("Dashboard")
    }
}
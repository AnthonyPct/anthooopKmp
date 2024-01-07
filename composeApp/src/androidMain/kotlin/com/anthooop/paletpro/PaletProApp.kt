package com.anthooop.paletpro

import android.app.Application
import com.anthooop.paletpro.base.di.KoinInit
import com.anthooop.paletpro.base.di.androidModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class PaletProApp : Application() {

    ///////////////////////////////////////////////////////////////////////////
    // LIFECYCLE
    ///////////////////////////////////////////////////////////////////////////

    override fun onCreate() {
        super.onCreate()

        KoinInit().init {
            androidLogger(level = Level.DEBUG)
            androidContext(androidContext = this@PaletProApp)
            modules(
                listOf(
                    androidModules,
                ),
            )
        }
    }
}

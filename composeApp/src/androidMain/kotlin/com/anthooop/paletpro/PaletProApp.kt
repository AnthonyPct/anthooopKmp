package com.anthooop.paletpro

import android.app.Application
import com.anthooop.paletpro.base.di.androidModules
import com.anthooop.paletpro.base.di.commonModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class PaletProApp : Application() {

    ///////////////////////////////////////////////////////////////////////////
    // LIFECYCLE
    ///////////////////////////////////////////////////////////////////////////

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(level = Level.DEBUG)
            androidContext(androidContext = this@PaletProApp)
            modules(
                listOf(
                    commonModule(),
                    androidModules
                ),
            )
        }
    }
}

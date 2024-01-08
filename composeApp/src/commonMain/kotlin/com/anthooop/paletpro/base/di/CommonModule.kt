package com.anthooop.paletpro.base.di

import com.anthooop.paletpro.MainViewModel
import org.koin.core.module.Module
import org.koin.dsl.module


fun commonModule() = module {
    factory {
        MainViewModel()
    }
}

expect fun platformModule(): Module

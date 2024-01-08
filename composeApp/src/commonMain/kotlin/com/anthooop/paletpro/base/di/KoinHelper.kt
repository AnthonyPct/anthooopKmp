package com.anthooop.paletpro.base.di

import org.koin.core.Koin
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin() {
    startKoin {
        modules(listOf(commonModule()))
    }
}

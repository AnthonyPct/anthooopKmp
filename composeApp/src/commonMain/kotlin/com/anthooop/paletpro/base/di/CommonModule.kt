package com.anthooop.paletpro.base.di

import com.anthooop.paletpro.MainViewModel
import com.anthooop.paletpro.core.data.repository.AuthenticationRepositoryImpl
import com.anthooop.paletpro.core.domain.repository.AuthenticationRepository
import org.koin.core.module.Module
import org.koin.dsl.module


fun commonModule() = module {
    factory {
        MainViewModel(get())
    }
}

fun repositoryModule() = module {
    single<AuthenticationRepository> {
        AuthenticationRepositoryImpl()
    }
}

expect fun platformModule(): Module

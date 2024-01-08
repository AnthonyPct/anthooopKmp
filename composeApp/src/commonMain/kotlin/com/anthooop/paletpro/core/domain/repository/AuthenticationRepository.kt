package com.anthooop.paletpro.core.domain.repository

import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {
    fun isConnected(): Flow<Boolean>
}
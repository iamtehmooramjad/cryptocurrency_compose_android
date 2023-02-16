package com.dev175.cryptocurrency.domain.repository

import com.dev175.cryptocurrency.data.remote.dto.CoinDetailDto
import com.dev175.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}
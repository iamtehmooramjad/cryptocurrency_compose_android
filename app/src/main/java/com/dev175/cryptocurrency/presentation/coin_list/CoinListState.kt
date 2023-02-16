package com.dev175.cryptocurrency.presentation.coin_list

import com.dev175.cryptocurrency.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error:String = ""
)

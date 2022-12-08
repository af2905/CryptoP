package com.github.af2905.cryptop.core.repository

import com.github.af2905.cryptop.core.database.entity.TopListCoin

private const val DEFAULT_LIMIT = 100
private const val DEFAULT_PAGE = 0
private const val DEFAULT_CURRENCY = "USD"

interface TopListRepository {
    suspend fun getTopListBy24HVolumeFullData(
        limit: Int = DEFAULT_LIMIT,
        page: Int = DEFAULT_PAGE,
        tSym: String = DEFAULT_CURRENCY
    ): List<TopListCoin>
}
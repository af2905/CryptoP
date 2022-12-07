package com.github.af2905.cryptop.core.network.api

import retrofit2.http.GET
import retrofit2.http.Query

private const val DEFAULT_LIMIT = 100
private const val DEFAULT_PAGE = 0
private const val DEFAULT_CURRENCY = "USD"

interface TopListsApi {

    @GET("top/totalvolfull")
    fun getTopListBy24HVolumeFullData(
        @Query(ApiParams.LIMIT) limit: Int = DEFAULT_LIMIT,
        @Query(ApiParams.PAGE) page: Int = DEFAULT_PAGE,
        @Query(ApiParams.TSYM) tSym: String = DEFAULT_CURRENCY
    )
}
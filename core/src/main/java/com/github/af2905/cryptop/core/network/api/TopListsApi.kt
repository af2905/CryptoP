package com.github.af2905.cryptop.core.network.api

import com.github.af2905.cryptop.core.network.api.params.ApiParams
import com.github.af2905.cryptop.core.network.data.dto.TopListResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface TopListsApi {

    @GET("top/totalvolfull")
    suspend fun getTopListBy24HVolumeFullData(
        @Query(ApiParams.LIMIT) limit: Int,
        @Query(ApiParams.PAGE) page: Int,
        @Query(ApiParams.TSYM) tSym: String
    ): TopListResponseDto
}
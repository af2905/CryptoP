package com.github.af2905.cryptop.core.network.api

import com.github.af2905.cryptop.core.network.data.dto.NewsResponseDto
import retrofit2.http.GET

interface NewsApi {

    @GET("v2/news/")
    suspend fun getLatestNewsArticles() : NewsResponseDto
}
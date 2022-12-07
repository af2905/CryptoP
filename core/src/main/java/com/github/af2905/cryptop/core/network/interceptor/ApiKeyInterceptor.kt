package com.github.af2905.cryptop.core.network.interceptor

import com.github.af2905.cryptop.core.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

private const val API_KEY_QUERY_PARAMETER = "api_key"

class ApiKeyInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val url = request.url.newBuilder()
            .addQueryParameter(API_KEY_QUERY_PARAMETER, BuildConfig.API_KEY)
            .build()
        val newRequest = request.newBuilder().url(url).build()
        return chain.proceed(newRequest)
    }
}
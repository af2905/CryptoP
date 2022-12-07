package com.github.af2905.cryptop.core.network.interceptor

import com.github.af2905.cryptop.core.network.error.*
import okhttp3.Interceptor
import okhttp3.Response
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

class ErrorInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        try {
            return handledResponse(chain)
        } catch (apiException: ApiException) {
            throw apiException
        } catch (e: Exception) {
            if (e is ConnectException || e is UnknownHostException || e is SocketTimeoutException) {
                throw ConnectionException(e.message)
            }
            throw UndefinedException(e)
        }
    }

    private fun handledResponse(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())
        if (response.isSuccessful) {
            return response
        }

        val message = response.body.string()

        when (response.code) {
            in HttpResponseCode.SERVER_ERROR.code -> {
                throw ServerException(message = message)
            }
            in HttpResponseCode.BAD_REQUEST.code, in HttpResponseCode.CLIENT_ERROR.code -> {
                throw ClientException(message = message)
            }
            else -> throw IllegalStateException(
                "Unexpected response with code: ${response.code} and body: ${response.body}"
            )
        }
    }
}
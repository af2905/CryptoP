package com.github.af2905.cryptop.core.network.error

enum class HttpResponseCode(val code: IntRange) {
    OK(200..299),
    BAD_REQUEST(400..400),
    CLIENT_ERROR(401..499),
    SERVER_ERROR(500..526)
}
package com.github.af2905.cryptop.core.network.error

import java.io.IOException

abstract class ApiException(message: String?) : IOException(message)

class UndefinedException(throwable: Throwable) : ApiException(throwable.message) {
    init {
        addSuppressed(throwable)
    }
}

class ConnectionException(message: String?) : ApiException(message)
class ClientException(message: String?) : ApiException(message)
class ServerException(message: String?) : ApiException(message)
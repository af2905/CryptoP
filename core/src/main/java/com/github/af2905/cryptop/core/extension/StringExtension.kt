package com.github.af2905.cryptop.core.extension

fun String?.getFullPath(): String? = this?.let { "https://cryptocompare.com/$this" }
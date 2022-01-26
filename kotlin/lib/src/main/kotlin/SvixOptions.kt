package com.svix.kotlin

data class SvixOptions(val serverUrl: String = DEFAULT_URL) {
    private val version = "0.43.2"

    companion object {
        const val DEFAULT_URL = "https://api.svix.com"
    }

    internal fun getUA(): String {
        return "svix-libs/$version/kotlin"
    }
}
package com.cc.network.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class HeadersInterceptor(
    private val headers: Map<String, String>
) : Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()

        for((header, value) in headers){
            request.addHeader(header, value)
        }

        return chain.proceed(request.build())
    }
}
package com.cc.network.service

import retrofit2.http.GET

interface CurrencyService {

    @GET("latest")
    suspend fun getExchangeRates(): ExchangeRatesResponse

}
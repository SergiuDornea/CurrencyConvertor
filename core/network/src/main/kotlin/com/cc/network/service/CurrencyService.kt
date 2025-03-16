package com.cc.network.service

import com.cc.network.model.response.currency_converter.ExchangeRatesResponse
import retrofit2.http.GET

interface CurrencyService {

    @GET("latest")
    suspend fun getExchangeRates(): ExchangeRatesResponse

}
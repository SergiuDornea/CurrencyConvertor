package com.cc.network.model.response.currency_converter

import kotlinx.serialization.Serializable

@Serializable
data class ExchangeRatesResponse (
    val meta: Meta,
    val data : Map<String, CurrencyInfo>
)
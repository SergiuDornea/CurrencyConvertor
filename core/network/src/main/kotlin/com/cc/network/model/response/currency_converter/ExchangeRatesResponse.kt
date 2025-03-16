package com.cc.network.model.response.currency_converter

import com.cc.model.currency_convertor.CurrencyInfo
import com.cc.model.currency_convertor.Meta
import kotlinx.serialization.Serializable

@Serializable
data class ExchangeRatesResponse(
    val meta: Meta,
    val data: Map<String, CurrencyInfo>
)
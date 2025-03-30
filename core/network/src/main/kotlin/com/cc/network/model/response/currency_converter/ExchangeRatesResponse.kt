package com.cc.network.model.response.currency_converter

import com.cc.model.currency_convertor.CurrencyInfo
import com.cc.model.currency_convertor.ExchangeRates
import com.cc.model.currency_convertor.Meta
import kotlinx.serialization.Serializable

@Serializable
data class ExchangeRatesResponse(
    val meta: Meta,
    val data: Map<String, CurrencyInfo>
)

fun ExchangeRatesResponse.toExchangeRates(baseCurrency: String): ExchangeRates {
    return ExchangeRates(
        baseCurrency = baseCurrency,
        rates = data.mapValues { it.value.value },
        lastUpdatedDate = meta.lastUpdatedAt
    )
}
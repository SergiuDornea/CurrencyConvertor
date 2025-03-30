package com.cc.data.repository

import com.cc.model.currency_convertor.ExchangeRates
import com.cc.network.model.response.currency_converter.toExchangeRates
import com.cc.network.service.CurrencyService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CurrencyRepositoryImpl @Inject constructor(
    private val service: CurrencyService
) : CurrencyRepository {

    override suspend fun getExchangeRates(): ExchangeRates {
        return service.getExchangeRates().toExchangeRates(baseCurrency = "USD")
    }
}
package com.cc.data.repository

import com.cc.model.currency_convertor.ExchangeRates
import kotlinx.coroutines.flow.Flow

interface CurrencyRepository {

    suspend fun getExchangeRates(): ExchangeRates

}
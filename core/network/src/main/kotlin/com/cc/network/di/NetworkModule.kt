package com.cc.network.di

import com.cc.network.BuildConfig
import com.cc.network.constants.Constants
import com.cc.network.interceptor.HeadersInterceptor
import com.cc.network.service.CurrencyService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import javax.inject.Singleton
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BASIC
        }
        return OkHttpClient
            .Builder()
            .addNetworkInterceptor(loggingInterceptor)
            .addNetworkInterceptor(HeadersInterceptor(mapOf("apiKey" to BuildConfig.API_KEY)))
            .build()
    }

    @Provides
    @Singleton
    fun providesCurrencyRetrofitService(
        client: OkHttpClient
    ): CurrencyService {
        return Retrofit
            .Builder()
            .baseUrl(Constants.BASE_URL)
            .client(client)
            .addConverterFactory(Json.asConverterFactory(MediaType.get("application/json")))
            .build()
            .create(CurrencyService::class.java)
    }
}
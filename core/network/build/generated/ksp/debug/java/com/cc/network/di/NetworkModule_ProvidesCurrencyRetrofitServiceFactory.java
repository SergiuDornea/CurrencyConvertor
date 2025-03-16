package com.cc.network.di;

import com.cc.network.service.CurrencyService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class NetworkModule_ProvidesCurrencyRetrofitServiceFactory implements Factory<CurrencyService> {
  private final Provider<OkHttpClient> clientProvider;

  public NetworkModule_ProvidesCurrencyRetrofitServiceFactory(
      Provider<OkHttpClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public CurrencyService get() {
    return providesCurrencyRetrofitService(clientProvider.get());
  }

  public static NetworkModule_ProvidesCurrencyRetrofitServiceFactory create(
      Provider<OkHttpClient> clientProvider) {
    return new NetworkModule_ProvidesCurrencyRetrofitServiceFactory(clientProvider);
  }

  public static CurrencyService providesCurrencyRetrofitService(OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesCurrencyRetrofitService(client));
  }
}

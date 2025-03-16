plugins {
    alias(libs.plugins.currencyconvertor.android.library)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.cc.network"
}

dependencies {
    implementation(libs.retrofit)
    implementation(libs.retrofit.logger)
    implementation(libs.retrofit.kotlin.serialization)
    implementation(libs.kotlin.serialization.json)
}
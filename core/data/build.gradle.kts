plugins {
    alias(libs.plugins.currencyconvertor.android.library)
    alias(libs.plugins.currencyconvertor.android.hilt)
}

android {
    namespace = "com.cc.data"
}

dependencies {
    implementation(project(":core:model"))
    implementation(project(":core:network"))
}
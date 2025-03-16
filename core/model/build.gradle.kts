plugins {
    alias(libs.plugins.currencyconvertor.jvm)
    id("kotlinx-serialization")
}

dependencies {
    implementation(libs.kotlin.serialization.json)
}
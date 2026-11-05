plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "kz.karzhybaskaru.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "kz.karzhybaskaru.app"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
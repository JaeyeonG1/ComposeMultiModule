plugins {
    // Android Library
    id(Plugins.Kotlin.Android)
    id(Plugins.Android.Library)

    // Hilt
    id(Plugins.Hilt)
    id(Plugins.Kapt)
}

android {
    namespace = "com.tambi.network"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        minSdk = AppConfig.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = AppConfig.sourceCompat
        targetCompatibility = AppConfig.targetCompat
    }

    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }
}

dependencies {

    // Kotlin
    Dependencies.Kotlin.forEach(::implementation)

    // Hilt
    Dependencies.Hilt.Compiler.forEach(::kapt)
    Dependencies.Hilt.Android.forEach(::implementation)

    // Network
    Dependencies.Network.forEach(::implementation)

    // Logging
    Dependencies.Logging.forEach(::implementation)
}

kapt {
    // Allow references to generated code
    correctErrorTypes = true
}

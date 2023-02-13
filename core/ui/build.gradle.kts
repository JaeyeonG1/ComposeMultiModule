plugins {
    // Android Library
    id(Plugins.Kotlin.Android)
    id(Plugins.Android.Library)
}

android {
    namespace = "com.tambi.designsystem"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        minSdk = AppConfig.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures{
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.Compose.Compiler
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
    implementation(project(":core:designsystem"))

    // Android Core
    Dependencies.Android.Ktx.forEach(::implementation)

    // Compose
    Dependencies.Compose.Ui.forEach(::implementation)
    Dependencies.Compose.Material.forEach(::implementation)
    Dependencies.Compose.Debug.forEach(::debugImplementation)

    // Image
    Dependencies.Image.forEach(::implementation)
}

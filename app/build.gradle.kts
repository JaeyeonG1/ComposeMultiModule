plugins {
    // Android Application
    id(Plugins.Kotlin.Android)
    id(Plugins.Android.Application)

    // Hilt
    id(Plugins.Hilt)
    id(Plugins.Kapt)
}

android {
    namespace = AppConfig.appId
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = AppConfig.appId
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {

        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
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
    // Modules
    implementation(project(":core:designsystem"))

    // Kotlin
    Dependencies.Kotlin.forEach(::implementation)

    // Android UI
    Dependencies.Android.Ktx.forEach(::implementation)
    Dependencies.Android.Activity.forEach(::implementation)
    Dependencies.Android.Lifecycle.forEach(::implementation)
    Dependencies.Android.SplashScreen.forEach(::implementation)

    Dependencies.Navigation.forEach(::implementation)

    // Compose
    Dependencies.Compose.Ui.forEach(::implementation)
    Dependencies.Compose.Activity.forEach(::implementation)
    Dependencies.Compose.Material.forEach(::implementation)
    Dependencies.Compose.SystemUi.forEach(::implementation)

    // Image
    Dependencies.Image.forEach(::implementation)

    // Hilt
    Dependencies.Hilt.Compiler.forEach(::kapt)
    Dependencies.Hilt.Android.forEach(::implementation)

    // Logging
    Dependencies.Logging.forEach(::implementation)
}

kapt {
    // Allow references to generated code
    correctErrorTypes = true
}

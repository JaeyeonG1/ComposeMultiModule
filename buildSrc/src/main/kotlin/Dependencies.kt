object Dependencies {
    val GradleDependencies = listOf(
        "com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:${Versions.BuildTool.Ksp}",
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.Kotlin}",
        "com.android.tools.build:gradle:${Versions.BuildTool.AndroidGradle}",
        "com.google.dagger:hilt-android-gradle-plugin:${Versions.Jetpack.Hilt}",
        "com.google.gms:google-services:${Versions.Google.Services}"
    )

    val Kotlin = listOf(
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Kotlin.Coroutines}",
        "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.Kotlin.Serialization}"
    )

    object Android {
        val Ktx = listOf(
            "androidx.core:core-ktx:${Versions.Androidx.Core.Ktx}"
        )
        val Activity = listOf(
            "androidx.activity:activity:${Versions.Androidx.Core.Activity}"
        )
        val Lifecycle = listOf(
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Androidx.Core.Lifecycle}",
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Androidx.Core.Lifecycle}"
        )
        val SplashScreen = listOf(
            "androidx.core:core-splashscreen:${Versions.Androidx.Core.SplashScreen}"
        )
    }

    val Navigation = listOf(
        "androidx.hilt:hilt-navigation-compose:${Versions.Jetpack.HiltCompose}",
        "androidx.navigation:navigation-compose:${Versions.Androidx.Navigation}",
    )

    object Hilt {
        val Compiler = listOf("com.google.dagger:hilt-android-compiler:${Versions.Jetpack.Hilt}")
        val Android = listOf("com.google.dagger:hilt-android:${Versions.Jetpack.Hilt}")
    }

    object Room {
        val Compiler = listOf("androidx.room:room-compiler:${Versions.Jetpack.Room}")
        val Ktx = listOf("androidx.room:room-ktx:${Versions.Jetpack.Room}")
    }

    object Compose {
        val Compiler = listOf("androidx.compose.compiler:compiler:${Versions.Compose.Compose}")
        val Ui = listOf(
            "androidx.compose.runtime:runtime:${Versions.Compose.Compose}",
            "androidx.compose.animation:animation:${Versions.Compose.Compose}",
            "androidx.compose.ui:ui-tooling-preview:${Versions.Compose.Compose}",
            "androidx.compose.foundation:foundation:${Versions.Compose.Foundation}",
            "androidx.compose.foundation:foundation-layout:${Versions.Compose.Foundation}"
        )
        val Activity = listOf(
            "androidx.activity:activity-compose:${Versions.Compose.ActivityCompose}"
        )
        val Material = listOf(
            "androidx.compose.material3:material3:${Versions.Material.Material3}",
            "androidx.compose.material:material-icons-extended:${Versions.Material.Material}",
            "androidx.compose.material3:material3-window-size-class:${Versions.Material.Material3}"
        )
        val SystemUi = listOf(
            "com.google.accompanist:accompanist-systemuicontroller:${Versions.Compose.SystemUi}"
        )
        val Debug = listOf(
            "androidx.compose.ui:ui-tooling:${Versions.Compose.Compose}"
        )
    }

    val Image = listOf(
        "io.coil-kt:coil:${Versions.Util.Coil}",
        "io.coil-kt:coil-svg:${Versions.Util.Coil}",
        "io.coil-kt:coil-compose:${Versions.Util.Coil}"
    )

    val Network = listOf(
        "com.squareup.retrofit2:retrofit:${Versions.Network.Retrofit}",
        "com.squareup.retrofit2:converter-gson:${Versions.Network.Retrofit}",
        "com.squareup.okhttp3:logging-interceptor:${Versions.Network.OkHttp}",
        "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.Network.KotlinSerializationConverter}"
    )

    val Logging = listOf(
        "com.jakewharton.timber:timber:${Versions.Logging.Timber}",
        "com.localebro:okhttpprofiler:${Versions.Logging.OkHttpProfiler}",
    )

    val Debug = listOf(
        "com.facebook.stetho:stetho:${Versions.Debug.Stetho}",
        "com.facebook.stetho:stetho-okhttp3:${Versions.Debug.Stetho}",
        "com.squareup.leakcanary:leakcanary-android:${Versions.Debug.LeakCanary}"
    )
}

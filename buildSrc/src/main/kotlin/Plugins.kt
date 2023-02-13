object Plugins {

    const val Ksp = "com.google.devtools.ksp"
    const val Kapt = "kotlin-kapt"

    object Kotlin {
        const val Jvm = "org.jetbrains.kotlin.jvm"
        const val Serialization = "org.jetbrains.kotlin.plugin.serialization"
        const val Android = "org.jetbrains.kotlin.android"
    }

    object Android {
        const val Application = "com.android.application"
        const val Library = "com.android.library"
    }

    const val Hilt = "com.google.dagger.hilt.android"
}

object Versions {

    object BuildTool {
        const val Ksp = "1.8.0-1.0.9"
        const val AndroidGradle = "7.4.1"
        const val BuildTool = "33.0.3"
    }

    object Google {
        const val Services = "4.3.15"
    }

    object Kotlin {
        /**
         * Compose Kotlin 호환성 문서 확인 필요
         * @see <a href="https://developer.android.com/jetpack/androidx/releases/compose-kotlin">Compatibility map<a>
         */
        const val Kotlin = "1.8.0"
        const val Serialization = "1.4.1"
        const val Coroutines = "1.6.4"
    }

    object Androidx {
        object Core {
            const val Ktx = "1.9.0"
            const val Activity = "1.6.1"
            const val Lifecycle = "2.5.1"
            const val SplashScreen = "1.0.0"
        }

        const val Navigation = "2.5.3"
    }

    object Compose {
        /**
         * Compose Kotlin 호환성 문서 확인 필요
         * @see <a href="https://developer.android.com/jetpack/androidx/releases/compose-kotlin">Compatibility map<a>
         */
        const val Compiler = "1.4.0"
        const val Compose = "1.3.3"
        const val Foundation = "1.3.1"
        const val ActivityCompose = "1.6.1"
        const val SystemUi = "0.28.0"
    }

    object Material {
        const val Material = "1.3.1"
        const val Material3 = "1.0.1"
    }

    object Jetpack {
        const val Hilt = "2.45"
        const val HiltCompose = "1.0.0"
        const val Room = "2.5.0"
    }

    object Network {
        const val Retrofit = "2.9.0"
        const val OkHttp = "4.10.0"
        const val KotlinSerializationConverter = "0.8.0"
    }

    object Util {
        const val Coil = "2.2.2"
    }

    object Logging {
        const val Timber = "5.0.1"
        const val OkHttpProfiler = "1.0.8"
    }

    object Debug {
        const val Stetho = "1.6.0"
        const val LeakCanary = "2.9.1"
    }
}

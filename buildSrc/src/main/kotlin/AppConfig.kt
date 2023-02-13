import org.gradle.api.JavaVersion

object AppConfig {

    const val appId = "com.tambi.baseproject"

    /**
     * App Sdk Version
     */
    const val minSdk = 26
    const val targetSdk = 33
    const val compileSdk = 33

    /**
     * App Version
     */
    private const val majorVersion = 1
    private const val minorVersion = 0
    private const val patchVersion = 0
    const val versionName = "$majorVersion.$minorVersion.$patchVersion"
    const val versionCode = 1

    /**
     * Java / JVM Version
     */
    const val jvmTarget = "1.8"
    val sourceCompat = JavaVersion.VERSION_1_8
    val targetCompat = JavaVersion.VERSION_1_8
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    /**
     * Use `apply false` in the top-level build.gradle file to add a Gradle
     * plugin as a build dependency but not apply it to the current (root)
     * project. Don't use `apply false` in sub-projects. For more information,
     * see Applying external plugins with same version to subprojects.
     */
    id(Plugins.Ksp) version Versions.BuildTool.Ksp apply false
    id(Plugins.Kotlin.Jvm) version Versions.Kotlin.Kotlin apply false
    id(Plugins.Kotlin.Serialization) version Versions.Kotlin.Kotlin apply false
    id(Plugins.Kotlin.Android) version Versions.Kotlin.Kotlin apply false
    id(Plugins.Android.Application) version Versions.BuildTool.AndroidGradle apply false
    id(Plugins.Android.Library) version Versions.BuildTool.AndroidGradle apply false
    id(Plugins.Hilt) version Versions.Jetpack.Hilt apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        Dependencies.GradleDependencies.forEach { dependency -> classpath(dependency) }
    }
}

tasks.register("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral() // mavenCentral added here, no luck :( 
        maven(url = "https://plugins.gradle.org")
        maven("https://developer.huawei.com/repo/")
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.30")

        /**
         * Upgrading to 2.1.0 causes the following exception :
         * org.gradle.internal.resolve.ArtifactNotFoundException: Could not find stem-plugin-2.1.0.jar
         */
        classpath("com.likethesalad.android:stem-plugin:2.1.0")
    }
}

allprojects {
    repositories {
        google()
        gradlePluginPortal()
        maven(url = "https://jitpack.io")
        maven(url = "https://plugins.gradle.org")
        maven("https://developer.huawei.com/repo/")
    }
}
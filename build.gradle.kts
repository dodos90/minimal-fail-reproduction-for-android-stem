// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        gradlePluginPortal()
        maven(url = "https://plugins.gradle.org")
        maven("https://developer.huawei.com/repo/")
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.30")

        classpath("com.likethesalad.android:stem-plugin:2.0.0")
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
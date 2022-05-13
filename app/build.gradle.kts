buildscript {
    repositories {
        google()
        gradlePluginPortal()
    }

    dependencies {}
}

plugins {
    id("com.android.application")

    // Kotlin support
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    defaultConfig {
        applicationId = "com.example.minimal-repro-for-android-stem"
        versionCode = 1
        versionName = "1.0.0"
    }

    kotlinOptions { jvmTarget = "11" }
}

dependencies {
}

apply(plugin = "com.likethesalad.stem")
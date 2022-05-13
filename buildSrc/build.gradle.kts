plugins {
    kotlin("jvm") version "1.5.21"
}

repositories {
    google()
    mavenCentral()
}

dependencies {

    /**
     * THIS IS THE DEPENDENCY CAUSING ALL THIS TROUBLE
     * COMMENTING IT WOULD PREVENT THE GRADLE SYNC PROCESS FROM FAILING WITH
     * java.lang.NoSuchMethodError: 'java.lang.Object dagger.internal.Preconditions.checkNotNullFromProvides(java.lang.Object)'
     */
    implementation("com.android.tools.build:gradle:7.1.3")
}
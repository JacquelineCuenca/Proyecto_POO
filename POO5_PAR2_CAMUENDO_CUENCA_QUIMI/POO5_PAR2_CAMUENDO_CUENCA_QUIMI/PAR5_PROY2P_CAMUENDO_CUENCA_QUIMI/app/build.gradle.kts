plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.pruebaproyecto2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.pruebaproyecto2"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(fileTree(mapOf(
        "dir" to "C:\\Users\\Usuario\\AppData\\Local\\Android\\Sdk\\platforms\\android-34",
        "include" to listOf("*.aar", "*.jar"),

    )))
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
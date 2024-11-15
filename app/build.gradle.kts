@file:Suppress("DEPRECATION")

plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-kapt")
}

android {
    namespace = "com.emanh.emanh"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.emanh.emanh"
        minSdk = 28
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        true.also { dataBinding = it }
        viewBinding = true
    }
    packagingOptions {
        exclude("META-INF/NOTICE.md")
        exclude("META-INF/LICENSE.md")
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.databinding.runtime)

    implementation(libs.com.ucrop)

    implementation(libs.com.android.mail)
    implementation(libs.com.android.activation)
    implementation(libs.org.kotlinx.coroutines.android)

    implementation(libs.bundles.comLibs)

    implementation(libs.androidx.fragment.ktx)

    implementation(libs.androidx.viewpager2)
    implementation(libs.me.circleindicator)
}
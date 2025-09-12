import java.util.Properties
import kotlin.apply

plugins {
    id("com.android.application") version "8.12.3"
    id("org.jetbrains.kotlin.android") version "2.2.0"
    id("org.jetbrains.kotlin.plugin.compose") version "2.2.0"
    id("com.google.devtools.ksp") version "2.2.0-2.0.2"
    id("com.google.dagger.hilt.android") version "2.57.1"
}

val properties = Properties().apply {
    load(project.rootProject.file("local.properties").inputStream())
}
hilt {
    enableAggregatingTask = false
}
android {
    namespace = "com.ku.corkcharge"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.ku.corkcharge"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        buildConfigField("String", "BASE_URL", properties["base.url"].toString())
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig  = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // navigation
    implementation("androidx.navigation:navigation-compose:2.9.4")

    //serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")

    // coil
    implementation("io.coil-kt.coil3:coil-compose:3.3.0")
    implementation("io.coil-kt.coil3:coil-network-okhttp:3.3.0")

    // Network
    implementation(platform("com.squareup.okhttp3:okhttp-bom:5.1.0"))
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:1.0.0")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.57.1")
    implementation("androidx.hilt:hilt-navigation-compose:1.3.0")
    ksp("com.google.dagger:hilt-android-compiler:2.57.1")
    ksp("com.google.dagger:hilt-compiler:2.57.1")
    ksp("androidx.hilt:hilt-compiler:1.3.0")
}
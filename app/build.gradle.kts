plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.nhinhnguyenuit.studyenglishforkids"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.nhinhnguyenuit.studyenglishforkids"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)


//    implementation("androidx.appcompat:appcompat:1.1.0")
//    implementation("androidx.legacy:legacy-support-v4:1.0.0")

//    implementation("android.arch.navigation:navigation-fragment-ktx:1.0.0")
//    implementation("android.arch.navigation:navigation-ui-ktx:1.0.0")

    implementation("com.google.android.material:material:1.1.0-alpha09")
    implementation("de.hdodenhof:circleimageview:3.0.0")

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
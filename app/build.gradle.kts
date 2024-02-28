plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.dgopadakak.cicdlearning"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.dgopadakak.cicdlearning"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    signingConfigs {
        create("release") {
            if (file("keystore/keystore_config.properties").exists()) {
                val keystorePropsFile = file("keystore/keystore_config.properties")
                val items = HashMap<String, String>()
                keystorePropsFile.forEachLine {
                    items[it.split("=")[0]] = it.split("=")[1]
                }
                storeFile = file(items["storeFile"]!!)
                storePassword = items["storePassword"]
                keyAlias = items["keyAlias"]
                keyPassword = items["keyPassword"]
            } else {
                storeFile = file("keystore/keystoreandroid")
                storePassword = System.getenv("KEYSTORE_PASS")
                keyAlias = System.getenv("KEY_ALIAS")
                keyPassword = System.getenv("KEY_PASS")
            }
        }
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("release")
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
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
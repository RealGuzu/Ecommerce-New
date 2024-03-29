plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.hellosummer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.hellosummer"
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
        buildFeatures {

            viewBinding = true


            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_1_8
                targetCompatibility = JavaVersion.VERSION_1_8
            }
        }

        dependencies {

            implementation("androidx.appcompat:appcompat:1.6.1")
            implementation("com.google.android.material:material:1.11.0")
            implementation("androidx.constraintlayout:constraintlayout:2.1.4")
            testImplementation("junit:junit:4.13.2")
            androidTestImplementation("androidx.test.ext:junit:1.1.5")
            androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

            //viewpager 2
            implementation("androidx.viewpager2:viewpager2:1.0.0")

//rounded imageview
            implementation("com.makeramen:roundedimageview:2.3.0")

            implementation("com.github.bumptech.glide:glide:4.16.0")

            implementation("com.github.denzcoskun:ImageSlideshow:0.1.0")
        }
    }
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}

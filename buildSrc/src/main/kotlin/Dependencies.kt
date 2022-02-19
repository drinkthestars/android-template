object Project {
    private const val agpVersion = "7.2.0-beta02"
    const val jvmTarget = "1.8"
    const val agp = "com.android.tools.build:gradle:$agpVersion"

    object Kotlin {
        const val version = "1.6.10"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }
}

object Libs {
    const val junit = "junit:junit:4.13"
    const val material = "com.google.android.material:material:1.1.0"

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Project.Kotlin.version}"
    }

    object Accompanist {
        private const val version = "0.24.2-alpha"
        const val insets = "com.google.accompanist:accompanist-insets:$version"
        const val systemUiController =
            "com.google.accompanist:accompanist-systemuicontroller:$version"
    }

    object Coil {
        private const val version = "1.4.0"
        const val compose = "io.coil-kt:coil-compose:$version"
    }

    object Coroutines {
        private const val version = "1.6.0"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.7.0"

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.4.0"
        }

        object Compose {
            const val version = "1.2.0-alpha03"

            const val animation = "androidx.compose.animation:animation:$version"
            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val iconsExtended = "androidx.compose.material:material-icons-extended:$version"
            const val material = "androidx.compose.material:material:$version"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val ui = "androidx.compose.ui:ui:$version"
            const val uiUtil = "androidx.compose.ui:ui-util:$version"
            const val test = "androidx.compose.ui:ui-test:$version"
            const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
        }

        object Hilt {
            private const val version = "1.0.0"
            const val navigationCompose = "androidx.hilt:hilt-navigation-compose:$"
        }

        object Lifecycle {
            const val viewModelCompose =
                "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.0-alpha02"
        }

        object Navigation {
            private const val version = "2.5.0-alpha02"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
            const val compose = "androidx.navigation:navigation-compose:$version"
        }

        object Test {
            private const val androidxTestVersion = "1.3.0"
            const val core = "androidx.test:core:$androidxTestVersion"
            const val rules = "androidx.test:rules:$androidxTestVersion"

            object Ext {
                private const val version = "1.1.2"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }

            const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
        }
    }

    object Hilt {
        private const val version = "2.40"
        const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
        const val android = "com.google.dagger:hilt-android:$version"
        const val kaptCompiler = "com.google.dagger:hilt-android-compiler:$version"
    }
}

object Project {
    private const val agpVersion = "7.0.0-alpha06"
    const val jvmTarget = "1.8"
    const val agp = "com.android.tools.build:gradle:$agpVersion"

    object Kotlin {
        const val version = "1.4.30"
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
        private const val version = "0.6.0"
        const val coil = "dev.chrisbanes.accompanist:accompanist-coil:$version"
        const val insets = "dev.chrisbanes.accompanist:accompanist-insets:$version"
    }

    object Coroutines {
        private const val version = "1.4.1"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.5.0-beta01"

        object Compose {
            const val version = "1.0.0-beta01"
            private const val activityVersion = "1.3.0-alpha03"
            private const val navigationVersion = "1.0.0-alpha08"
            private const val viewModelVersion = "1.0.0-alpha02"

            const val activity = "androidx.activity:activity-compose:$activityVersion"
            const val animation = "androidx.compose.animation:animation:$version"
            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val iconsExtended = "androidx.compose.material:material-icons-extended:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val material = "androidx.compose.material:material:$version"
            const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val test = "androidx.compose.ui:ui-test:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val ui = "androidx.compose.ui:ui:$version"
            const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
            const val uiUtil = "androidx.compose.ui:ui-util:$version"
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:$viewModelVersion"
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
}

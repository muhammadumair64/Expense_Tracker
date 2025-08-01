// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.5.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id ("com.android.library") version "8.0.2" apply false
    id ("com.google.dagger.hilt.android") version "2.50" apply false

    id ("com.google.gms.google-services") version "4.3.15" apply false
    id ("com.google.firebase.crashlytics") version "2.9.0" apply false
    id ("com.google.firebase.firebase-perf") version "1.4.2" apply false
}
package com.ku.corkcharge

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CorkChargeApplication: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
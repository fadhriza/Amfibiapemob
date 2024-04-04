package com.abo.amfibia

import android.app.Application
import com.abo.amfibia.data.AppContainer
import com.abo.amfibia.data.DefaultAppContainer

class AmphibiansApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
package com.github.af2905.cryptop

import android.app.Application
import com.github.af2905.cryptop.core.di.CoreComponent
import com.github.af2905.cryptop.core.di.CoreComponentStore
import com.github.af2905.cryptop.core.di.DaggerCoreComponent
import timber.log.Timber

class App : Application(), CoreComponentStore {

    private val coreComponent: CoreComponent = DaggerCoreComponent.factory().create(this)

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

    override fun getComponent(): CoreComponent = coreComponent
}
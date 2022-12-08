package com.github.af2905.cryptop.core.di

import android.content.Context
import com.github.af2905.cryptop.core.di.module.NetworkModule
import com.github.af2905.cryptop.core.di.module.StorageModule
import com.github.af2905.cryptop.core.di.scope.AppScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@AppScope
@Component(
    modules = [
        AndroidInjectionModule::class,
        NetworkModule::class,
        StorageModule::class
    ]
)
interface CoreComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): CoreComponent
    }
}

/*@AppScope
@Component(
    modules = [
        AndroidInjectionModule::class,
        NetworkModule::class,
        RepositoryModule::class,
        StorageModule::class,
        WorkManagerModule::class,
        ResourceModule::class
    ]
)
interface CoreComponent {

    fun getMoviesRepository(): MoviesRepository
    fun getPeopleRepository(): PeopleRepository
    fun getSearchRepository(): SearchRepository
    fun getAppWorkerFactory(): AppWorkerFactory

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): CoreComponent
    }
}*/
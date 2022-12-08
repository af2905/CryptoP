package com.github.af2905.cryptop.core.di.module

import android.content.Context
import androidx.room.Room
import com.github.af2905.cryptop.core.database.AppDatabase
import com.github.af2905.cryptop.core.database.dao.TopListCoinDao
import com.github.af2905.cryptop.core.di.scope.AppScope
import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @AppScope
    @Provides
    fun provideCoinDao(database: AppDatabase): TopListCoinDao = database.coinDao()

    @AppScope
    @Provides
    fun provideRoomDatabase(context: Context): AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, "database").build()
}
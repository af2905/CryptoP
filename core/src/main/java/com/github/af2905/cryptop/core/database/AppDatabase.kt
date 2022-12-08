package com.github.af2905.cryptop.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.github.af2905.cryptop.core.database.dao.TopListCoinDao
import com.github.af2905.cryptop.core.database.entity.TopListCoin

@Database(entities = [TopListCoin::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun coinDao(): TopListCoinDao
}
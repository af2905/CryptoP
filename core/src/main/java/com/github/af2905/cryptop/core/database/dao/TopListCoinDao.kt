package com.github.af2905.cryptop.core.database.dao

import androidx.room.*
import com.github.af2905.cryptop.core.database.entity.TopListCoin

@Dao
interface TopListCoinDao {
    @Query("SELECT * FROM TopListCoin ORDER BY price")
    suspend fun getCoinList(): List<TopListCoin>

    @Query("SELECT * FROM TopListCoin WHERE id =:id")
    suspend fun getCoinById(id: Int): TopListCoin

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(list: List<TopListCoin>)

    @Delete
    suspend fun delete(coin: TopListCoin)
}
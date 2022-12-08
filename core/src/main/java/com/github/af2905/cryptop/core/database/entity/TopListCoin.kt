package com.github.af2905.cryptop.core.database.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TopListCoin(
    @PrimaryKey val id: Int,
    @Embedded val coinInfo: TopListCoinInfo,
    @Embedded val rawInfo: TopListCoinRawInfo,
    @Embedded val displayInfo: TopListCoinDisplayInfo
)

data class TopListCoinInfo(
    val id: String,
    val name: String,
    val fullName: String,
    val internal: String,
    val imageUrl: String,
    val url: String
)

data class TopListCoinRawInfo(
    val price: String?,
    val lastUpdate: String?
)

data class TopListCoinDisplayInfo(
    val fromSymbol: String?,
    val toSymbol: String?,
    val market: String?,
    val price: String?,
    val lastUpdate: String?,
    val lastVolume: String?,
    val lastVolumeTo: String?,
    val lastTradeId: String?,
    val volumeDay: String?,
    val volumeDayTo: String?,
    val volume24Hour: String?,
    val volume24HourTo: String?,
    val openDay: String?,
    val highDay: String?,
    val lowDay: String?,
    val open24Hour: String?,
    val high24Hour: String?,
    val low24Hour: String?,
    val lastMarket: String?,
    val volumeHour: String?,
    val volumeHourTo: String?,
    val openHour: String?,
    val highHour: String?,
    val lowHour: String?,
    val topTierVolume24Hour: String?,
    val topTierVolume24HourTo: String?,
    val change24Hour: String?,
    val changePct24Hour: String?,
    val changeDay: String?,
    val changePctDay: String?,
    val changeHour: String?,
    val changePctHour: String?,
    val conversionType: String?,
    val conversionSymbol: String?,
    val supply: String?,
    val mktCap: String?,
    val totalVolume24H: String?,
    val totalVolume24HTo: String?,
    val totalTopTierVolume24H: String?,
    val totalTopTierVolume24HTo: String?,
    val imageUrl: String?
)
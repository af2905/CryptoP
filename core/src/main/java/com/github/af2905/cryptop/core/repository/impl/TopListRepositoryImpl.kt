package com.github.af2905.cryptop.core.repository.impl

import com.github.af2905.cryptop.core.database.entity.TopListCoin
import com.github.af2905.cryptop.core.network.api.TopListsApi
import com.github.af2905.cryptop.core.repository.TopListRepository
import javax.inject.Inject

class TopListRepositoryImpl @Inject constructor(
    val api: TopListsApi
) : TopListRepository {
    override suspend fun getTopListBy24HVolumeFullData(
        limit: Int,
        page: Int,
        tSym: String
    ): List<TopListCoin> {
        TODO("Not yet implemented")
    }
}
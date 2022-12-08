package com.github.af2905.cryptop.core.di.module

import com.github.af2905.cryptop.core.repository.TopListRepository
import com.github.af2905.cryptop.core.repository.impl.TopListRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {

    @Binds
    fun bindTopListRepository(topListRepository: TopListRepositoryImpl): TopListRepository
}
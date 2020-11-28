package com.rogok.hilt.di

import com.rogok.hilt.repository.MainRepository
import com.rogok.hilt.retrofit.BlogRetrofit
import com.rogok.hilt.retrofit.NetworkMapper
import com.rogok.hilt.room.BlogDao
import com.rogok.hilt.room.CacheMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {
    @Singleton
    @Provides
    fun provideMainRepository(
        blogDao: BlogDao,
        blogRetrofit: BlogRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): MainRepository {
        return MainRepository(blogDao, blogRetrofit, cacheMapper, networkMapper)
    }
}
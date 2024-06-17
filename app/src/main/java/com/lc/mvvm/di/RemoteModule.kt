package com.lc.mvvm.di

import com.lc.data.repository.AppRemote
import com.lc.remote.repository.AppRemoteImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    @Provides
    @Singleton
    fun provideAppRemote(appRemote: AppRemoteImp): AppRemote {
        return appRemote
    }
}
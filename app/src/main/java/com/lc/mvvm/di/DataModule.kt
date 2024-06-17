package com.lc.mvvm.di

import com.lc.data.AppRepositoryImp
import com.lc.data.SettingsRepositoryImp
import com.lc.domain.repository.AppRepository
import com.lc.domain.repository.SettingsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideAppRepository(appRepository: AppRepositoryImp): AppRepository =
        appRepository

    @Provides
    @Singleton
    fun provideSettingRepository(): SettingsRepository =
        SettingsRepositoryImp("BuildConfig.VERSION_NAME")

}
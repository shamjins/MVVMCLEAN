package com.lc.mvvm.di

import android.content.Context
import com.lc.data.repository.AppLocal
import com.lc.local.AppLocalImp
import com.lc.local.dao.CompanyDao
import com.lc.local.database.AppDatabase
import com.lc.local.utils.LocalPreferenceHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Provides
    @Singleton
    fun provideCompanyDao(appDatabase: AppDatabase): CompanyDao {
        return appDatabase.companyDao()
    }

    @Provides
    @Singleton
    fun provideAppLocal(appLocal: AppLocalImp): AppLocal {
        return appLocal
    }

    @Provides
    @Singleton
    fun providePreferenceHelper(@ApplicationContext context: Context): LocalPreferenceHelper {
        return LocalPreferenceHelper(context)
    }
}
package com.lc.data.source

import com.lc.data.repository.AppDataSource
import com.lc.data.repository.AppLocal
import javax.inject.Inject

open class AppDataSourceFactory @Inject constructor(
    private val appLocal: AppLocal,
    private val localDataSource: AppLocalDataSource,
    private val remoteDataSource: AppRemoteDataSource
) {

    open suspend fun getDataStore(isCached: Boolean): AppDataSource {
        return if (isCached) {
            return getLocalDataSource()
        } else {
            getRemoteDataSource()
        }
    }


    fun getRemoteDataSource(): AppDataSource {
        return remoteDataSource
    }

    fun getLocalDataSource(): AppDataSource {
        return localDataSource
    }
}
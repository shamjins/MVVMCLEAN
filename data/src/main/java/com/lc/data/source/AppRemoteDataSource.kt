package com.lc.data.source

import com.lc.data.models.CompanyEntity
import com.lc.data.repository.AppDataSource
import com.lc.data.repository.AppRemote
import javax.inject.Inject

class AppRemoteDataSource @Inject constructor(
    private val appRemote: AppRemote
) : AppDataSource {
    override suspend fun saveCompanies(companies: List<CompanyEntity>) {
        throw UnsupportedOperationException("Save character is not supported for RemoteDataSource.")
    }
}
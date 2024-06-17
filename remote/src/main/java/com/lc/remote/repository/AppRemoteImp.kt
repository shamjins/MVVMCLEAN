package com.lc.remote.repository

import com.lc.data.models.CompanyEntity
import com.lc.data.repository.AppRemote
import com.lc.remote.api.AppServices
import com.lc.remote.mappers.CompanyEntityMapper
import javax.inject.Inject

class AppRemoteImp @Inject constructor(
    private val appServices: AppServices,
    private val companyEntityMapper: CompanyEntityMapper
): AppRemote {
    override suspend fun getCompanies(): List<CompanyEntity> {
        TODO("Not yet implemented")
    }
}
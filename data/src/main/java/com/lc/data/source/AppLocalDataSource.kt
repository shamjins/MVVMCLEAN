package com.lc.data.source

import com.lc.data.models.CompanyEntity
import com.lc.data.repository.AppDataSource
import com.lc.data.repository.AppLocal
import javax.inject.Inject

class AppLocalDataSource @Inject constructor(
    private val appLocal: AppLocal
) : AppDataSource {
    override suspend fun saveCompanies(companies: List<CompanyEntity>) {
        appLocal.saveCompany(companies)
    }
}
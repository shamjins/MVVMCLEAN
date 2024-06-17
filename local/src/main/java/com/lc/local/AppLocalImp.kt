package com.lc.local

import com.lc.data.models.CompanyEntity
import com.lc.data.repository.AppLocal
import com.lc.local.dao.CompanyDao
import com.lc.local.mapper.CompanyLocalMapper
import com.lc.local.utils.LocalPreferenceHelper
import javax.inject.Inject

class AppLocalImp @Inject constructor(
    private val companyDao: CompanyDao,
    private val companyLocalMapper: CompanyLocalMapper,
    private val preferenceHelper: LocalPreferenceHelper
) : AppLocal {

    override suspend fun saveCompany(companies: List<CompanyEntity>) {
        companyDao.addCompanies(
            *companies.map {
                companyLocalMapper.mapToLocal(it)
            }.toTypedArray()
        )
    }
}
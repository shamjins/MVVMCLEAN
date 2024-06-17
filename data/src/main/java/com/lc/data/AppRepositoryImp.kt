package com.lc.data

import com.lc.data.mapper.CompanyMapper
import com.lc.data.repository.AppDataSource
import com.lc.data.source.AppDataSourceFactory
import com.lc.domain.models.Company
import com.lc.domain.repository.AppRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AppRepositoryImp @Inject constructor(
    private val appDataSource: AppDataSource,
    private val appDataSourceFactory: AppDataSourceFactory,
    private val companyMapper: CompanyMapper
) : AppRepository {
    override suspend fun getCompanies(): Flow<List<Company>> {
        TODO("Not yet implemented")
    }

    override suspend fun saveCompany(companies: List<Company>) {
        val companyEntities = companies.map { company ->
            companyMapper.mapToEntity(company)
        }
        appDataSourceFactory.getLocalDataSource().saveCompanies(companyEntities)
    }
}
package com.lc.domain.repository

import com.lc.domain.models.Company
import kotlinx.coroutines.flow.Flow


interface AppRepository {
    //Remote
    suspend fun getCompanies(): Flow<List<Company>>


    //Local
    suspend fun saveCompany(companies: List<Company>)
}
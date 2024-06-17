package com.lc.data.repository

import com.lc.data.models.CompanyEntity

interface AppDataSource {
    //Remote

    //Local
    suspend fun saveCompanies(companies: List<CompanyEntity>)
}
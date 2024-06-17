package com.lc.data.repository

import com.lc.data.models.CompanyEntity

interface AppLocal {
    suspend fun saveCompany(companies: List<CompanyEntity>)
}
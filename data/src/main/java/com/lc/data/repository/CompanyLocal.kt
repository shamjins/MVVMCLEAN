package com.lc.data.repository

import com.lc.data.models.CompanyEntity

interface CompanyLocal {
    suspend fun saveCompany(companies: List<CompanyEntity>)
}
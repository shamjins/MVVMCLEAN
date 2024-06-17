package com.lc.data.repository

import com.lc.data.models.CompanyEntity

interface AppRemote {
    suspend fun getCompanies(): List<CompanyEntity>
}
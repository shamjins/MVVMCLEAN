package com.lc.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.lc.local.utils.LocalConstants

@Entity(tableName = LocalConstants.COMPANY_TABLE_NAME)
data class CompanyLocalEntity(
    @PrimaryKey
    val id: Int,
    val name: String
)
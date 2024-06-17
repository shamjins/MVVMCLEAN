package com.lc.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.lc.local.utils.LocalConstants

@Entity(tableName = LocalConstants.EMPLOYEE_TABLE_NAME)
data class EmployeeLocalEntity(
    @PrimaryKey
    val id: Int,
    val name: String
)

package com.lc.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.lc.local.models.CompanyLocalEntity

@Dao
interface CompanyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCompanies(vararg company: CompanyLocalEntity)
}
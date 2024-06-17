package com.lc.local.mapper

import com.lc.data.models.CompanyEntity
import com.lc.local.models.CompanyLocalEntity
import javax.inject.Inject

class CompanyLocalMapper @Inject constructor(
    private val employeeLocalMapper: EmployeeLocalMapper
) : LocalMapper<CompanyLocalEntity, CompanyEntity> {
    override fun mapFromLocal(type: CompanyLocalEntity): CompanyEntity {
        return CompanyEntity(id = type.id, name = type.name)
    }

    override fun mapToLocal(type: CompanyEntity): CompanyLocalEntity {
        return CompanyLocalEntity(id = type.id, name = type.name)
    }
}
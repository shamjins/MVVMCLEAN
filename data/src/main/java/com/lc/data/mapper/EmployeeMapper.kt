package com.lc.data.mapper

import com.lc.data.models.CompanyEntity
import com.lc.data.models.EmployeeEntity
import javax.inject.Inject

class EmployeeMapper @Inject constructor() : Mapper<CompanyEntity, EmployeeEntity> {
    override fun mapFromEntity(type: CompanyEntity): EmployeeEntity {
        return EmployeeEntity(id = type.id, name = type.name)
    }

    override fun mapToEntity(type: EmployeeEntity): CompanyEntity {
        return CompanyEntity(id = type.id, name = type.name)
    }
}
package com.lc.data.mapper

import com.lc.data.models.CompanyEntity
import com.lc.domain.models.Company
import javax.inject.Inject

class CompanyMapper @Inject constructor(
    private val employeeMapper: EmployeeMapper
) : Mapper<CompanyEntity, Company> {
    override fun mapFromEntity(type: CompanyEntity): Company {
        return Company(id = type.id, name = type.name)
    }

    override fun mapToEntity(type: Company): CompanyEntity {
        return CompanyEntity(id = type.id, name = type.name)
    }
}
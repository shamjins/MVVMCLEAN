package com.lc.local.mapper

import com.lc.data.models.EmployeeEntity
import com.lc.local.models.EmployeeLocalEntity
import javax.inject.Inject

class EmployeeLocalMapper @Inject constructor() :
    LocalMapper<EmployeeLocalEntity, EmployeeEntity> {
    override fun mapFromLocal(type: EmployeeLocalEntity): EmployeeEntity {
        return EmployeeEntity(id = type.id, name = type.name)
    }

    override fun mapToLocal(type: EmployeeEntity): EmployeeLocalEntity {
        return EmployeeLocalEntity(id = type.id, name = type.name)
    }
}
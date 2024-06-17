package com.lc.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.lc.local.dao.CompanyDao
import com.lc.local.models.CompanyLocalEntity
import com.lc.local.utils.LocalConstants
import com.lc.local.utils.Migrations
import javax.inject.Inject

@Database(
    entities = [CompanyLocalEntity::class],
    version = Migrations.DB_VERSION,
    exportSchema = false
)
abstract class AppDatabase @Inject constructor() : RoomDatabase() {

    abstract fun companyDao(): CompanyDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase = INSTANCE ?: synchronized(this) {
            INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            LocalConstants.DB_NAME
        ).build()
    }
}
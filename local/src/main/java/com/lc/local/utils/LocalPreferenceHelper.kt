package com.lc.local.utils

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject

open class LocalPreferenceHelper @Inject constructor(context: Context) {

    companion object {
        private const val PREF_PACKAGE_NAME = "com.lc.mvvm.local.preferences"
        private const val PREF_KEY_LAST_CACHE = "last_local_data"
    }

    private val preferences: SharedPreferences =
        context.getSharedPreferences(PREF_PACKAGE_NAME, Context.MODE_PRIVATE)

    var lastLocalTime: Long
        get() = preferences.getLong(PREF_KEY_LAST_CACHE, 0)
        set(lastCache) = preferences.edit().putLong(PREF_KEY_LAST_CACHE, lastCache).apply()
}
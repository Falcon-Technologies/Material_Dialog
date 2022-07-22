package com.falcon.technologies.preference

import androidx.preference.PreferenceManager
import com.falcon.technologies.App
import com.falcon.technologies.utils.MATERIAL_YOU
import com.falcon.technologies.utils.VersionUtils

object PreferenceUtil {
    private val sharedPreferences=PreferenceManager.getDefaultSharedPreferences(App.getContext())

    val materialYou
        get() = sharedPreferences.getBoolean(MATERIAL_YOU, VersionUtils.hasS())

}
package com.falcon.technologies.extension

import android.widget.Button
import com.falcon.technologies.R
import com.falcon.technologies.preference.PreferenceUtil.materialYou

fun Button.accentTextColor() {
    if (materialYou) return
    setTextColor(context.getColor(R.color.purple_500))
}
package com.newolf.composetutorial.utils

import android.content.Context
import android.content.Intent
import com.newolf.composetutorial.BasicLayoutActivity
import com.newolf.composetutorial.LocalMessageActivity
import com.newolf.composetutorial.SunflowerActivity

/**
 * ======================================================================
 *
 *
 * @author : NeWolf
 * @version : 1.0
 * @since :  2024-02-19
 *
 * =======================================================================
 */
object Navigator {

    fun startMessageActivity(context: Context) {
        context.startActivity(Intent(context, LocalMessageActivity::class.java))
    }

    fun startBasicLayoutActivity(context: Context) {
        context.startActivity(Intent(context, BasicLayoutActivity::class.java))
    }

    fun startSunflowerActivity(context: Context) {
        context.startActivity(Intent(context, SunflowerActivity::class.java))
    }

    fun startSunflowerMainActivity(context: Context) {

    }
}
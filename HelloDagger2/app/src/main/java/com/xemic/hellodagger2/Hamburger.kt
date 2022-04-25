package com.xemic.hellodagger2

import android.util.Log
import javax.inject.Inject

class Hamburger @Inject constructor(
    private val bread: Bread,
    private val meat: Meat
) {
    companion object {
        val TAG = "Hamburger"
    }

    fun eat() {
        Log.d(TAG, "yum~ yum~")
    }
}

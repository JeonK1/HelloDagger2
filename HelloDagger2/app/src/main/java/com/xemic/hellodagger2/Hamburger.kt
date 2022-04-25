package com.xemic.hellodagger2

import android.util.Log
import javax.inject.Inject

class Hamburger @Inject constructor(
    private val eater: Person,
    private val bread: Bread,
    private val meat: Meat
) {
    companion object {
        val TAG = "Hamburger"
    }

    fun eat() {
        Log.d(TAG, "eat by : ${eater}(${eater.name})")
        Log.d(TAG, "meat count : ${meat.count}")
        Log.d(TAG, "meat grade : ${meat.grade}")
        Log.d(TAG, "yum~ yum~")
    }
}
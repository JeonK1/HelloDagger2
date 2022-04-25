package com.xemic.hellodagger2

import android.util.Log

class FoodInformation (
    val country: String,
    val price: Int
) {
    companion object {
        val TAG = "FoodInformation"
    }

    fun printCurrentFoodInfo(){
        Log.d(TAG, "country: ${country}, price: ${price}")
    }
}
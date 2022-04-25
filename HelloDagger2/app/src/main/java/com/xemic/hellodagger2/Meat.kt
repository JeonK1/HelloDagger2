package com.xemic.hellodagger2

import javax.inject.Inject

class Meat @Inject constructor() {
    var count = 0

    fun add() {
        count++
    }
}
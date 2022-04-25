package com.xemic.hellodagger2

import javax.inject.Inject

class ChickenMeat @Inject constructor() : Meat {
    override var count = 0

    override fun add() {
        count++
    }
}
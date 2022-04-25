package com.xemic.hellodagger2

import javax.inject.Inject

class ChickenMeat @Inject constructor(
    override var count: Int,
    override var grade: Int
) : Meat {

    override fun add() {
        count++
    }
}
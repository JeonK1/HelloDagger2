package com.xemic.hellodagger2

import dagger.Module
import dagger.Provides

@Module
class ChickenMeatModule (
    private val count: Int
) {

    @Provides
    fun provideCount(): Int {
        return count
    }

    @Provides
    fun provideMeat(meat: ChickenMeat): Meat {
        return meat
    }
}
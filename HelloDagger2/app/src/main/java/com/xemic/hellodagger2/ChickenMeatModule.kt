package com.xemic.hellodagger2

import dagger.Binds
import dagger.Module

@Module
abstract class ChickenMeatModule {

    @Binds
    abstract fun bindsMeat(meat: ChickenMeat): Meat
}
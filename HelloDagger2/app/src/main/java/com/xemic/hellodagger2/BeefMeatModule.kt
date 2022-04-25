package com.xemic.hellodagger2

import dagger.Binds
import dagger.Module

@Module
abstract class BeefMeatModule {

    @Binds
    abstract fun bindsMeat(meat: BeefMeat): Meat
}
package com.xemic.hellodagger2

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ChickenMeatModule {

    @Provides
    fun provideMeat(@Named("count") count: Int, @Named("grade") grade: Int): Meat {
        return ChickenMeat(count, grade)
    }
}
package com.xemic.hellodagger2

import dagger.Module
import dagger.Provides

@Module
object BreadModule {

    @JvmStatic
    @Provides
    fun provideFoodInformation(): FoodInformation {
        return FoodInformation("korea", 0).also {
            it.printCurrentFoodInfo()
        }
    }

    @JvmStatic
    @Provides
    fun provideBread(foodInfo: FoodInformation): Bread {
        return Bread(foodInfo)
    }
}
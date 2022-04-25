package com.xemic.hellodagger2

import dagger.Module
import dagger.Provides

@Module
class BreadModule {

    @Provides
    fun provideFoodInformation(): FoodInformation {
        return FoodInformation("korea", 0).also {
            it.printCurrentFoodInfo()
        }
    }

    @Provides
    fun provideBread(foodInfo: FoodInformation): Bread {
        return Bread(foodInfo)
    }
}
package com.xemic.hellodagger2

import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@ActivityScope
@Subcomponent(modules = [BreadModule::class, ChickenMeatModule::class])
interface HamburgerComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("count") count: Int,
            @BindsInstance @Named("grade") grade: Int
        ): HamburgerComponent
    }
}
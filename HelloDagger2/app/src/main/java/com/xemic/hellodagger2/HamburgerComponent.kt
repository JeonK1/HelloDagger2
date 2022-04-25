package com.xemic.hellodagger2

import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@ActivityScope
@Subcomponent(modules = [BreadModule::class, ChickenMeatModule::class])
interface HamburgerComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun meatCount(@Named("count") count: Int): Builder

        @BindsInstance
        fun meatGrade(@Named("grade") grade: Int): Builder

        fun build(): HamburgerComponent
    }
}
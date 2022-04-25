package com.xemic.hellodagger2

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [BreadModule::class, ChickenMeatModule::class])
interface HamburgerComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun meatCount(@Named("count") count: Int): Builder

        @BindsInstance
        fun meatGrade(@Named("grade") grade: Int): Builder

        fun build(): HamburgerComponent
    }
}

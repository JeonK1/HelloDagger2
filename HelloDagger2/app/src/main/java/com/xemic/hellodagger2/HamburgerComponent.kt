package com.xemic.hellodagger2

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [BreadModule::class, ChickenMeatModule::class])
interface HamburgerComponent {

    fun inject(mainActivity: MainActivity)

    fun getHamburger() : Hamburger

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun meatCount(@Named("count") count: Int): Builder

        @BindsInstance
        fun meatGrade(@Named("grade") grade: Int): Builder

        fun build(): HamburgerComponent
    }
}
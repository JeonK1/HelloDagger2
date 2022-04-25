package com.xemic.hellodagger2

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [PersonModule::class])
interface AppComponent {
    fun getEater(): Person
}
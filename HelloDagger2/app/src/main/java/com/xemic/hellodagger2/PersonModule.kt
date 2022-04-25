package com.xemic.hellodagger2

import dagger.Module
import javax.inject.Singleton

@Module
abstract class PersonModule {

    @Singleton
    fun getPerson(): Person {
        return Person()
    }
}
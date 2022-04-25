package com.xemic.hellodagger2

import dagger.Component

@Component(modules = [BreadModule::class])
interface HamburgerComponent {
    fun inject(mainActivity: MainActivity)
}
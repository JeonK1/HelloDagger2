package com.xemic.hellodagger2

import dagger.Component

@Component
interface HamburgerComponent {
    fun getHamburger(): Hamburger
}
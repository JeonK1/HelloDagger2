package com.xemic.hellodagger2

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Person @Inject constructor(
) {
    val name = "xemic"
}
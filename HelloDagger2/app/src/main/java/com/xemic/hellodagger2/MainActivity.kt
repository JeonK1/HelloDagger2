package com.xemic.hellodagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @field:Inject
    lateinit var hamburger1: Hamburger
    @field:Inject
    lateinit var hamburger2: Hamburger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: HamburgerComponent = DaggerHamburgerComponent
            .builder()
            .meatCount(2)
            .meatGrade(1)
            .build()
        component.inject(this)

        hamburger1.eat()
        hamburger2.eat()
    }
}
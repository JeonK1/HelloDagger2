package com.xemic.hellodagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @field:Inject
    lateinit var hamburger1: Hamburger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: HamburgerComponent = (application as MyApplication).appComponent
            .getHamburgerComponentFactory()
            .create(count = 2, grade = 1)
        component.inject(this)

        hamburger1.eat()
    }
}
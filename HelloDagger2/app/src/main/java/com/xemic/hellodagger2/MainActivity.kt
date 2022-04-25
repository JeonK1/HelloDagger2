package com.xemic.hellodagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val hamburger: Hamburger by lazy {
        DaggerHamburgerComponent.create().getHamburger()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hamburger.eat()
    }
}
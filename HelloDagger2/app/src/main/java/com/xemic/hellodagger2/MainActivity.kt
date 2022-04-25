package com.xemic.hellodagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @field:Inject
    lateinit var hamburger: Hamburger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // #2. Field Injection: hambuerger 객체 DaggerHamburgerComponent.inject() 로 생성하기
        val component: HamburgerComponent = DaggerHamburgerComponent.create()
        component.inject(this)

        hamburger.eat()
    }
}
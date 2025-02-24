package com.example.createacc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    val splashScreenDuration = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed({
            // Start MainActivity after the delay
            val intent = Intent(this, Slides::class.java)
            startActivity(intent)
            finish() // Close SplashActivity so user can't navigate back to it
        }, splashScreenDuration)
    }
}
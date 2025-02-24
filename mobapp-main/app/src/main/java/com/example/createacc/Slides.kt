package com.example.createacc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageView
import android.widget.ViewFlipper

class Slides : AppCompatActivity() {
    private lateinit var viewFlipper: ViewFlipper
    private lateinit var nextButton: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slides)


        // Initialize ViewFlipper and Button
        viewFlipper = findViewById(R.id.viewFlipper)
        nextButton = findViewById(R.id.btnGo)

        // Inflate and add each slide layout to the ViewFlipper
        val inflater = LayoutInflater.from(this)
        val slide1 = inflater.inflate(R.layout.slide_1, viewFlipper, false)
        val slide2 = inflater.inflate(R.layout.slide_2, viewFlipper, false)
        val slide3 = inflater.inflate(R.layout.slide_3, viewFlipper, false)

        viewFlipper.addView(slide1)
        viewFlipper.addView(slide2)
        viewFlipper.addView(slide3)

        // Set click listener on the button
        nextButton.setOnClickListener {
            if (viewFlipper.displayedChild == viewFlipper.childCount - 1) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                viewFlipper.showNext()
            }
        }
    }
}
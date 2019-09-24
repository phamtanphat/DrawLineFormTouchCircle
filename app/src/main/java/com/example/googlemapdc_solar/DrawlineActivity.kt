package com.example.googlemapdc_solar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_drawline.*


class DrawlineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawline)
        paint_view.setTextView(tv_coordinates)
        paint_view.setOnTouchListener(paint_view)

    }

}

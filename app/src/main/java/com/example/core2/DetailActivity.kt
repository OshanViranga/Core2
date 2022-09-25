package com.example.core2

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val location = intent.getParcelableExtra<Location>("location")

        location?.let {
            val vName = findViewById<TextView>(R.id.name)
            vName.text = it.name

            val vDate = findViewById<TextView>(R.id.date)
            vDate.text = it.date

            val vRating = findViewById<RatingBar>(R.id.ratingBar)
            vRating.rating = it.rating

            val vImage = findViewById<ImageView>(R.id.image)
            val res = resources.getDrawable(it.resId)
            vImage.setImageDrawable(res)
        }



    }
}
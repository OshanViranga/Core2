package com.example.core2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vMelbourne = findViewById<ImageView>(R.id.city)
        val melId = resources.getIdentifier("city", "drawable", packageName)
        val melbourne = Location("Melbourne", "15/06/2020", 4.5F, melId)

        val vChangi = findViewById<ImageView>(R.id.changi)
        val changiId = resources.getIdentifier("changi", "drawable", packageName)
        val changi = Location("Changi", "09/04/2022", 5.0F, changiId)

        val vKandy = findViewById<ImageView>(R.id.kandy)
        val kandyId = resources.getIdentifier("kandy", "drawable", packageName)
        val kandy = Location("Kandy", "03/03/2022", 3.0F, kandyId)

        val vElla = findViewById<ImageView>(R.id.ella)
        val ellaId = resources.getIdentifier("ella", "drawable", packageName)
        val ella = Location("Ella", "23/05/2019", 3.0F, ellaId)

        vMelbourne.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("location", melbourne)
            startActivity(intent)
        }

        vChangi.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("location", changi)
            startActivity(intent)
        }

        vKandy.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("location", kandy)
            startActivity(intent)
        }

        vElla.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("location", ella)
            startActivity(intent)
        }
    }
}
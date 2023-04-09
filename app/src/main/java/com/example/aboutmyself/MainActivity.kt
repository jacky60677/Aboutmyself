package com.example.aboutmyself

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val introButton: Button = findViewById(R.id.introButton)
        val socialButton: Button = findViewById(R.id.socialButton)
        val musicButton: Button = findViewById(R.id.musicButton)

        introButton.setOnClickListener(this)
        socialButton.setOnClickListener(this)
        musicButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.introButton -> {
                val intent = Intent(this, IntroActivity::class.java)
                startActivity(intent)
            }
            R.id.socialButton -> {
                val intent = Intent(this, SocialLinksActivity::class.java)
                startActivity(intent)
            }
            R.id.musicButton -> {
                val intent = Intent(this, MusicActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

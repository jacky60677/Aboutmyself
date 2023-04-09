package com.example.aboutmyself

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class SocialLinksActivity : AppCompatActivity(){
    private lateinit var facebookButton: Button
    private lateinit var instagramButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_links)
        facebookButton = findViewById(R.id.facebookButton)
        instagramButton = findViewById(R.id.instagramButton)

        facebookButton.setOnClickListener {
            val fbIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100005713202254"))
            startActivity(fbIntent)
        }

        instagramButton.setOnClickListener {
            val instaIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/libra_jacky/"))
            startActivity(instaIntent)
        }
    }
    //ok

}

package com.example.aboutmyself

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MusicActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)

        mediaPlayer = MediaPlayer.create(this, R.raw.background_music)
        mediaPlayer.isLooping = true
        mediaPlayer.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}

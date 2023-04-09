package com.example.aboutmyself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class IntroActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var nameTextView: TextView
    private lateinit var introTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        imageView = findViewById(R.id.imageView)
        imageView.setOnClickListener {
            Toast.makeText(this, "您點擊了我的照片！", Toast.LENGTH_SHORT).show()
        }

        nameTextView = findViewById(R.id.nameTextView)
        nameTextView.text = "陳丞彥"

        introTextView = findViewById(R.id.introTextView)
        introTextView.text = "我是靜宜大學資管系二年級的學生。我喜歡硬體和學習新技術。我最喜歡用AI生成圖畫，或者用AI創造其他東西。"
    }
}

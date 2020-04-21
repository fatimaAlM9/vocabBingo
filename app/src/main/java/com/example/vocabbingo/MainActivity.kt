package com.example.vocabbingo

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private var pause: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mediaPlayer = MediaPlayer.create(applicationContext, R.raw.school_bell)
        mediaPlayer.start()



        game1.setOnClickListener {
            val intent = Intent(this, com.example.vocabbingo.game1::class.java)
            startActivity(intent)
                if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
                pause = true


            }
        }

        game2.setOnClickListener {
            val intent = Intent(this, com.example.vocabbingo.game2::class.java)
            startActivity(intent)
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
                pause = true


            }
        }

        opti_btn.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
                pause = true


            }
        }
    }
}

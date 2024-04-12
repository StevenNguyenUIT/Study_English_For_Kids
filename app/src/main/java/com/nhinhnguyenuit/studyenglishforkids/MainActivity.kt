package com.nhinhnguyenuit.studyenglishforkids

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val player = MediaPlayer.create(this, R.raw.splash2)
            player.start()
            val startIntent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(startIntent)
            overridePendingTransition(R.anim.fadein, R.anim.fadeout)
            finish()
        }, 1000)
    }
}

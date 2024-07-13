package com.excersices.musicplayerapp

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

       val title_text: TextView = findViewById(R.id.song_title)

        val forward_button: Button = findViewById(R.id.forwardbutton)
        val backward_button: Button = findViewById(R.id.backwardbutton)
        val play_button: Button = findViewById(R.id.playbutton)
        val pause_button: Button = findViewById(R.id.pausebutton)

        val seekBar: SeekBar = findViewById(R.id.seekBar)
        val time_left_text: TextView = findViewById(R.id.timelesttext)


        var mediaPlayer = MediaPlayer.create(this, R.raw.ik_varri_aa)

        seekBar.isClickable=false

        play_button.setOnClickListener(){
            mediaPlayer.start()

            var finaltime=mediaPlayer.duration.toDouble()
            var currenttime=mediaPlayer.currentPosition.toDouble()

             var oneTimeOnly=

            if(oneTimeOnly ==0){
                seekBar.max=finaltime.toInt()
                oneTimeOnly=1

                time_left_text.text =currenttime.toString()
                seekBar.setProgress(currenttime.toInt())

                handler.postDelayed(Updatedsongtime, 100)

            }

        }


    }
}
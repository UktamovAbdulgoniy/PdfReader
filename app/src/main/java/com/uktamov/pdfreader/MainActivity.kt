package com.uktamov.pdfreader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        object : CountDownTimer(2000,1000){
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {
                val intent = Intent(this@MainActivity,ViewPdfActivity::class.java)
                startActivity(intent)
                finish()
            }
        }.start()
    }
}
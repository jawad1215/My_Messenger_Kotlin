package com.jawad.mymessengerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class ReceiverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver)
        val receiverText=findViewById<TextView>(R.id.textView)
        val string=intent.getStringExtra("message")
        receiverText.text=string
    }
}

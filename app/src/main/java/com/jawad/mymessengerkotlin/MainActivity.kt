package com.jawad.mymessengerkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage()
    {
        val editText=findViewById<EditText>(R.id.editText)
        val messageText=editText.text.toString()
        val intent=Intent(Intent.ACTION_SEND)
        intent.type="text/plain"
        intent.putExtra(Intent.EXTRA_TEXT,messageText)
        val chooseIntent=Intent.createChooser(intent,"Send Message Via...")
        startActivity(chooseIntent)
    }
}

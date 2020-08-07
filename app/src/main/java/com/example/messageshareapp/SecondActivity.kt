package com.example.messageshareapp

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("SecondActivity", "START")
        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user_message_btn2")

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        txvUserMessage.text = msg
    }

}
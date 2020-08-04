package com.example.messageshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "Button was clicked !")
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }

        btnSensMsgToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            //This switches over to the other activity
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("user_message_btn2", message)

            startActivity(intent)
        }

        ShareToOtherApps.setOnClickListener {
            val message: String = etUserMessage.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to : "))
        }
    }

}
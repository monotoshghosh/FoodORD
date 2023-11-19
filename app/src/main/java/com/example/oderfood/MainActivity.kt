package com.example.oderfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY="com.example.oderfood.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<Button>(R.id.button2)
        val et1=findViewById<EditText>(R.id.eT1)
        val et2=findViewById<EditText>(R.id.eT2)
        val et3=findViewById<EditText>(R.id.eT3)

        btn.setOnClickListener {
            val msg=et1.text.toString()+" , "+et2.text.toString()+" , "+et3.text.toString()
            intent= Intent(this,secActivity::class.java)
            intent.putExtra(KEY,msg)
            startActivity(intent)
        }
    }

}
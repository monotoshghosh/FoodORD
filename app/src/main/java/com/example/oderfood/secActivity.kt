package com.example.oderfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.oderfood.databinding.ActivityMainBinding
import com.example.oderfood.databinding.ActivitySecBinding

class secActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySecBinding // Inside Main Class (& Class Name)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecBinding.inflate(layoutInflater) //Inside OnCreate Method
        setContentView(binding.root) // CHANGE
//        val textView =findViewById<TextView>(R.id.textView3)


        val msgOrder =intent.getStringExtra(MainActivity.KEY)
        binding.textView3.text=msgOrder.toString()

    }
}
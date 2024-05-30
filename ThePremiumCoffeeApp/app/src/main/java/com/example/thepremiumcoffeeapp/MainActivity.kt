package com.example.thepremiumcoffeeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.thepremiumcoffeeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // setting up the main activity view binding
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun appHome(view: View) {
        val name = binding.username.text.toString()
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("Name", name)
        startActivity(intent)
    }
}
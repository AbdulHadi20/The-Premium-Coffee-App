package com.example.thepremiumcoffeeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.thepremiumcoffeeapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = getIntent()
        val name = intent.getStringExtra("Name")

        binding.welcomeuser.text = "Welcome " + name

        //creating an event listener to go to the latte page
        binding.lattebtn.setOnClickListener {
            val name = binding.lattedisplay.text.toString()
            val intent = Intent(this, lattepage::class.java)
            intent.putExtra("Name", name)
            startActivity(intent)
        }

        //if user selects the cappuccino button
        binding.cappuccinobtn.setOnClickListener {
            val name = binding.cappuccinodisplay.text.toString()
            val intent = Intent(this, lattepage::class.java)
            intent.putExtra("Name", name)
            startActivity(intent)
        }

        //if user selects the espresso btn
        binding.espressobtn.setOnClickListener{
            val name = binding.espressodisplay.text.toString()
            val intent = Intent(this, lattepage::class.java)
            intent.putExtra("Name", name)
            startActivity(intent)
        }
    }

}
package com.example.thepremiumcoffeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thepremiumcoffeeapp.databinding.ActivityCheckoutpageBinding

class checkoutpage : AppCompatActivity() {
    private lateinit var binding: ActivityCheckoutpageBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityCheckoutpageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = getIntent()
        val cart = intent.getStringExtra("Cart")
        binding.result.text = "Your Order is = \n " + cart
    }
}
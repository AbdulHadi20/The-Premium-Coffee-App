package com.example.thepremiumcoffeeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.example.thepremiumcoffeeapp.databinding.ActivityLattepageBinding

class lattepage : AppCompatActivity() {

    private lateinit var binding: ActivityLattepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        //creating an array for the sizes
        val sizes = arrayOf("Small", "Medium", "Large")

        binding = ActivityLattepageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = getIntent()
        val name = intent.getStringExtra("Name")

        binding.coffeedisplay.text = "You have opted for " + name + "Coffee!"

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, sizes)

        //saving the button in a variable
        var addtocartbtn = findViewById(R.id.addtcart) as Button

        //saving the spinner in a variable
        var sizesspinner = findViewById(R.id.sizespinner) as Spinner

        //combining the spinner with the adapter
        sizesspinner.adapter = adapter
        sizesspinner.onItemSelectedListener = object :
        AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (sizesspinner.selectedItemPosition==0) {
                    binding.sizeselected.setText("" + sizesspinner.selectedItem) //Small
                }

                if (sizesspinner.selectedItemPosition==1) {
                    binding.sizeselected.setText("" + sizesspinner.selectedItem) //Medium
                }

                if (sizesspinner.selectedItemPosition==2) {
                    binding.sizeselected.setText("" + sizesspinner.selectedItem) //Large
                }
            }
        }

        addtocartbtn.setOnClickListener {
            if (sizesspinner.selectedItemPosition == 0 && name == "Latte: ") {
                binding.pricelist.setText("The Small Latte is for $10.")
            }

            if (sizesspinner.selectedItemPosition == 1 && name == "Latte: ") {
                binding.pricelist.setText("The Medium Latte is for $15.")
            }

            if (sizesspinner.selectedItemPosition == 2 && name == "Latte: ") {
                binding.pricelist.setText("The Large Latte is for $20.")
            }

            if (sizesspinner.selectedItemPosition == 0 && name == "Espresso: ") {
                binding.pricelist.setText("The Small Espresso is for $7.")
            }

            if (sizesspinner.selectedItemPosition == 1 && name == "Espresso: ") {
                binding.pricelist.setText("The Medium Espresso is for $12.")
            }

            if (sizesspinner.selectedItemPosition == 2 && name == "Espresso: ") {
                binding.pricelist.setText("The Large Espresso is for $15.")
            }

            if (sizesspinner.selectedItemPosition == 0 && name == "Cappuccino: ") {
                binding.pricelist.setText("The Small Cappuccino is for $3.")
            }

            if (sizesspinner.selectedItemPosition == 1 && name == "Cappuccino: ") {
                binding.pricelist.setText("The Medium Cappuccino is for $6.")
            }

            if (sizesspinner.selectedItemPosition == 2 && name == "Cappuccino: ") {
                binding.pricelist.setText("The Large Cappuccino is fpr $9.")
            }
        }

    }

    fun checkoutPage(view: View) {
        val intent = Intent(this, checkoutpage::class.java)
        val cart = binding.pricelist.text.toString()
        intent.putExtra("Cart", cart)
        startActivity(intent)
    }
}
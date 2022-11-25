package com.example.openbreweryapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.openbreweryapi.databinding.ActivityMainMenuBinding

class MainMenu : AppCompatActivity() , View.OnClickListener {
    private lateinit var binding : ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSearchBrewery.setOnClickListener(this)
        binding.btnBreweryList.setOnClickListener(this)
        binding.btnRandomBrewery.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id) {
            (R.id.btn_search_brewery) -> {
                val intent = Intent(this@MainMenu,MainActivity::class.java)
                startActivity(intent)

            }
            (R.id.btn_brewery_list) -> {
                val intent = Intent(this@MainMenu,MainActivity::class.java)
                startActivity(intent)
            }
            (R.id.btn_random_brewery)-> {
                val intent = Intent(this@MainMenu,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
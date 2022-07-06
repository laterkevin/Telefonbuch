package com.example.telefonbuch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.telefonbuch.contactadapter.ContactAdapter
import com.example.telefonbuch.data.Datasource
import com.example.telefonbuch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val contact = Datasource().loadContact()

        binding.contactRecycler.adapter = ContactAdapter(this, contact)

        binding.contactRecycler.setHasFixedSize(true)
    }
}
package com.rahul.intentservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rahul.intentservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Intent(this, MyIntentService::class.java).also {
                startService(it)
                binding.textView.text = "Service running"
            }
        }

        binding.button2.setOnClickListener {
            MyIntentService.stopService()
            binding.textView.text ="Service stopped"
        }

    }
}
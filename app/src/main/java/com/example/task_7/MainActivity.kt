package com.example.task_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task_7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bFrag2.setOnClickListener {
            supportFragmentManager
                .beginTransaction().replace(R.id.place_holder, BlankFragment2.newInstance())
                .commit()
        }
        supportFragmentManager
            .beginTransaction().replace(R.id.place_holder, BlankFragment.newInstance())
            .commit()
    }

}
package com.example.umshomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umshomework.Fragment.HomeFragment
import com.example.umshomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val homeFragment=HomeFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.frame,homeFragment)
            .commit()
    }
}
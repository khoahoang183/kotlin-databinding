package com.example.demo_kotlin_databinding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.demo_kotlin_databinding.R
import com.example.demo_kotlin_databinding.data.HKViewModel
import com.example.demo_kotlin_databinding.databinding.ActivityMainBinding

class HKMainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProviders.of(this).get(HKViewModel::class.java)
    }
    private lateinit var _binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        _binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments
        _binding.viewmodel = viewModel

    }
}
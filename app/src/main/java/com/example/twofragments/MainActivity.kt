package com.example.twofragments

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.twofragments.databinding.ActivityMainBinding
import com.example.twofragments.fragment.BlankFragment1
import com.example.twofragments.fragment.BlankFragment2

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = supportFragmentManager
        val tr = manager.beginTransaction()
        tr.replace(R.id.frameLayout,BlankFragment1())
        tr.addToBackStack(null)
        tr.commit()

        binding.button1.setOnClickListener {
            val manager = supportFragmentManager
            val tr = manager.beginTransaction()
            tr.replace(R.id.frameLayout,BlankFragment1())
            tr.addToBackStack(null)
            tr.commit()

        }
        binding.button2.setOnClickListener {
            val manager = supportFragmentManager
            val tr = manager.beginTransaction()
            tr.replace(R.id.frameLayout, BlankFragment2())
            tr.addToBackStack(null)
            tr.commit()

        }
    }
}
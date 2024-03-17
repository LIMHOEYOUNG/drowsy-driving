package com.example.drowsy_pro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drowsy_pro.databinding.DrowsynotificationPageBinding

class drowsynotification : AppCompatActivity() {
    private lateinit var binding: DrowsynotificationPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DrowsynotificationPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.goMypage.setOnClickListener {
            val intent = Intent(this, mypage::class.java)
            startActivity(intent)
        }
    }
}
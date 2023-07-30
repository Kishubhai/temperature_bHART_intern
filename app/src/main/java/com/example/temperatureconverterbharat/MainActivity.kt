package com.example.temperatureconverterbharat

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.temperatureconverterbharat.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var send_text: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        send_text=binding.ettext

        binding.button.setOnClickListener {
            val intent = Intent(this , secondActivity::class.java)
            intent.putExtra("text", send_text.getText().toString())
            startActivity(intent)
        }
    }
}
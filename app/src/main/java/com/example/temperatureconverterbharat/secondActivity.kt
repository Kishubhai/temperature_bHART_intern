package com.example.temperatureconverterbharat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.properties.Delegates

class secondActivity : AppCompatActivity() {
    lateinit var receiver_msg: TextView
    lateinit var receiver_msg2: TextView
    var a by Delegates.notNull<Double>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        receiver_msg = findViewById(R.id.received_value_id1)
        // create the get Intent object
        val intent = intent
        // receive the value by getStringExtra() method and
        // key must be same which is send by first activity
        val str = intent.getStringExtra("text")
        // display the string into textView
        val parsedInt = str?.toInt()?.plus(273)
        parsedInt.toString()
        receiver_msg.text = parsedInt.toString()

//        receiver_msg2 = findViewById(R.id.received_value_id2)
        // create the get Intent object

        val intent1 = intent
        // receive the value by getStringExtra() method and
        // key must be same which is send by first activity
        var str1 = intent1.getStringExtra("text")
        // display the string into textView
//        val parsedInt1 = str?.toInt()?
//        parsedInt1= (parsedInt1 * 1.8) + 32

//       var f= str1?.toDouble()
//        var c=((f?.times(9) ?: 5) )
//        c=c + 32;
//            receiver_msg2.text = resultstring



    }
}
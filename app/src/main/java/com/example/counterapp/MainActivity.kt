package com.example.counterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val viewCount=findViewById<TextView>(R.id.textViewCount)
        val buttonDecreaseCounter=findViewById<TextView>(R.id.decreaseCount)
        val buttonIncreaseCounter=findViewById<TextView>(R.id.increaseCount)
        val buttonResetCounter=findViewById<Button>(R.id.btnResetCount)
        var count=0

        buttonIncreaseCounter.setOnClickListener {
            //Increases the count value
            count++
            viewCount.text="$count"
        }
        buttonDecreaseCounter.setOnClickListener {
            //Decreases the count value
            count--
            viewCount.text="$count"
        }
        buttonResetCounter.setOnClickListener {
            //Reset the Counter
            count=0
            viewCount.text="$count"
        }
    }
}
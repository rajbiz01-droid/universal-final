package com.universal.creator

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(50, 100, 50, 50)
        }
        
        val text = TextView(this).apply {
            text = "Universal Creator\n\nFinally Working!"
            textSize = 24f
        }
        
        val btn1 = Button(this).apply {
            text = "Create Video"
        }
        
        val btn2 = Button(this).apply {
            text = "Create Photo"
        }
        
        layout.addView(text)
        layout.addView(btn1)
        layout.addView(btn2)
        
        setContentView(layout)
    }
}

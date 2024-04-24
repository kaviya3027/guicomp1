package com.example.guicomp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout: LinearLayout=findViewById(R.id.layout)
        val tv: TextView=findViewById(R.id.tv)
        val bt1: Button=findViewById(R.id.bt1)
        val bt2: Button=findViewById(R.id.bt2)
        val bt3: Button=findViewById(R.id.bt3)
        var size: Float =10f
        var i:Int=0
        var j:Int=0
        bt1.setOnClickListener {
            tv.setTextSize(size)
            size=(size+2)%20
        }
        bt2.setOnClickListener {
            when(i%3){
                0 -> tv.setTextColor(Color.BLACK)
                1 -> tv.setTextColor(Color.BLUE)
                2 -> tv.setTextColor(Color.GREEN)
            }
            i=i+1

        }
        bt3.setOnClickListener {
            when(j%3){
                0 -> layout.setBackgroundColor(Color.BLACK)
                1 -> layout.setBackgroundColor(Color.BLUE)
                2 -> layout.setBackgroundColor(Color.GREEN)
            }
            j=j+1
        }
    }
}
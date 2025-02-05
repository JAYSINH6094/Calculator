package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val op1=findViewById<EditText>(R.id.op1)
        val op2=findViewById<EditText>(R.id.op2)
        val result=findViewById<TextView>(R.id.result)
        val btn_add=findViewById<Button>(R.id.btn_add)
        val btn_sub=findViewById<Button>(R.id.btn_sub)
        val btn_multi=findViewById<Button>(R.id.btn_multi)
        val btn_div=findViewById<Button>(R.id.btn_div)
        val btn_clr=findViewById<Button>(R.id.btn_clr)

        btn_add.setOnClickListener{
            val num1=op1.text.toString().toInt()
            val num2=op2.text.toString().toInt()
            result.text=(num1+num2).toString()
        }

        btn_sub.setOnClickListener{
            val num1=op1.text.toString().toInt()
            val num2=op2.text.toString().toInt()
            result.text=(num1-num2).toString()

        }
        btn_multi.setOnClickListener {
            val num1 = op1.text.toString().toInt()
            val num2 = op2.text.toString().toInt()
            result.text = (num1 * num2).toString()
        }
        btn_div.setOnClickListener{
            val num1=op1.text.toString().toInt()
            val num2=op2.text.toString().toInt()
            result.text=(num1/num2).toString()
        }
        btn_clr.setOnClickListener{
            op1.setText("")
            op2.setText("")
            result.text=""
        }
    }
}
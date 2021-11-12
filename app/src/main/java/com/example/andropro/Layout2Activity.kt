package com.example.andropro

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Layout2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout2)

        val Rdgrp=findViewById<RadioGroup>(R.id.grp1)

        Rdgrp.setOnCheckedChangeListener { group, checkedId -> val btn:RadioButton=findViewById(checkedId)
        Toast.makeText(applicationContext, "${btn.text}", Toast.LENGTH_SHORT).show()
            btn.setTextColor(Color.parseColor("#fe9c02"))
        }


        val submit=findViewById<Button>(R.id.button5)
        submit.setOnClickListener {
            Toast.makeText(applicationContext, "Submitted Successfully", Toast.LENGTH_SHORT).show()
        }
    }
    fun check(ck: View){
        val res = ck as CheckBox
        if(res.isChecked){
            Toast.makeText(applicationContext, "${ck.text}", Toast.LENGTH_SHORT).show()
        }
    }
}
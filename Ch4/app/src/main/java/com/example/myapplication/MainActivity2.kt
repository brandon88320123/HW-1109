package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var rg1 = findViewById<RadioGroup>(R.id.radioGroup)
        rg1.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
            when (i) {
                R.id.radioButton1 -> "無糖"
                R.id.radioButton2 -> "少糖"
                R.id.radioButton3 -> "半糖"
                R.id.radioButton4 -> "全糖"

            }
        })
        var rg2 = findViewById<RadioGroup>(R.id.radioGroup2)
        rg2.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, i ->
            when (i) {
                R.id.radioButton5 -> "去冰"
                R.id.radioButton6 -> "微冰"
                R.id.radioButton7 -> "少冰"
                R.id.radioButton8 -> "正常冰"

            }
        })
        var send_btn = findViewById<Button>(R.id.btn_send)
        var set_drink = findViewById<EditText>(R.id.ed_drink)
        var sugar:String = "無糖"
        var ice_opt:String = "去冰"
        send_btn.setOnClickListener {
            set_drink = findViewById(R.id.ed_drink)
            val drink = set_drink.text.toString()
            val i = Intent()
            val b = Bundle()
            b.putString("sugar", sugar)
            b.putString("drink", drink)
            b.putString("ice", ice_opt)
            i.putExtras(b)
            setResult(101, i)
            finish()
        }
    }
}
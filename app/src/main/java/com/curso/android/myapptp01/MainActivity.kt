package com.curso.android.myapptp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonCompare:Button=findViewById(R.id.btnCompare)
        botonCompare.setOnClickListener { compareText() }
    }

    private fun compareText() {

        val stringField1:EditText=findViewById(R.id.txtFirstText)
        val stringField2:EditText=findViewById(R.id.txtSecondText)
        val lblresult:TextView=findViewById(R.id.lblResult)

        val stringFirst=stringField1.text.toString()
        val stringSecond=stringField2.text.toString()

        if(stringFirst==stringSecond) {
            lblresult.text = getString(R.string.txt_resoult_true)
        } else {
            lblresult.text = getString(R.string.txt_resoult_false)
        }
    }
}
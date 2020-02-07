package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val EXTRA_MESSAGE = "com.example.myapplication.MESSAGE"

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

    }
    fun calcIMC(view: View){
        val editText3 = findViewById<EditText>(R.id.editText3)
        val auxAltura = editText3.text.toString()
        val altura = auxAltura.toFloat()
        val editText = findViewById<EditText>(R.id.editText)
        val auxPeso = editText.text.toString()
        val peso = auxPeso.toFloat()
        var imc = peso/(altura*altura)

        val message = imc.toString()
        val intent = Intent(this, ResultActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
            putExtra("imc", imc)
        }
        startActivity(intent)
    }
}

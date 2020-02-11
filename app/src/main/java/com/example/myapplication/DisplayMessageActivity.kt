package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*

const val EXTRA_MESSAGE = "com.example.myapplication.MESSAGE"

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

    }

    fun notBlank(view: View){
        val editText = findViewById<EditText>(R.id.editText)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText3 = findViewById<EditText>(R.id.editText3)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)

        if(editText.text.toString().isEmpty()){
            Toast.makeText(this, "Os campos com * são obrigatórios.", Toast.LENGTH_SHORT).show()
            imageView.setBackgroundColor(Color.parseColor("#344955"))
            imageView2.setBackgroundColor(Color.parseColor("#7EAAC0"))
            imageView3.setBackgroundColor(Color.parseColor("#7EAAC0"))
        }else if(editText2.text.toString().isEmpty()){
            Toast.makeText(this, "Os campos com * são obrigatórios.", Toast.LENGTH_SHORT).show()
            imageView2.setBackgroundColor(Color.parseColor("#344955"))
            imageView.setBackgroundColor(Color.parseColor("#7EAAC0"))
            imageView3.setBackgroundColor(Color.parseColor("#7EAAC0"))
        }else if(editText3.text.toString().isEmpty()) {
            Toast.makeText(this, "Os campos com * são obrigatórios.", Toast.LENGTH_SHORT).show()
            imageView3.setBackgroundColor(Color.parseColor("#344955"))
            imageView.setBackgroundColor(Color.parseColor("#7EAAC0"))
            imageView2.setBackgroundColor(Color.parseColor("#7EAAC0"))
        }else{
            imageView.setBackgroundColor(Color.parseColor("#7EAAC0"))
            imageView2.setBackgroundColor(Color.parseColor("#7EAAC0"))
            imageView3.setBackgroundColor(Color.parseColor("#7EAAC0"))
            calcIMC(view)
        }
    }

    fun calcIMC(view: View){
        val editText3 = findViewById<EditText>(R.id.editText3)
        val auxAltura = editText3.text.toString()
        val altura = auxAltura.toFloat()
        val editText = findViewById<EditText>(R.id.editText)
        val auxPeso = editText.text.toString()
        val peso = auxPeso.toFloat()
        val imc = peso/(altura*altura)
        val resultado: String
        if(imc < 18.5){
            resultado = "Você precisa ganhar " + String.format("%.2f", (((altura*altura)*18.5)-peso)) + "kg para ter um IMC saudável."
        }else if(imc > 25){
            resultado = "Você precisa perder " + String.format("%.2f", (peso-((altura*altura)*25))) + "kg para ter um IMC saudável."
        }else{
            resultado = "Você tem um IMC saudável."
        }
        val message = imc.toString()
        val intent = Intent(this, ResultActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
            putExtra("imc", imc)
            putExtra("resultado", resultado)
        }
        startActivity(intent)
    }

    fun checkH(view: View){
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        if(checkBox2.isChecked){
            checkBox2.toggle()
        }
    }

    fun checkM(view: View){
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        if(checkBox.isChecked){
            checkBox.toggle()
        }
    }

    fun goBack(view: View){
        finish()
    }
}

package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TableRow
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.textView12).apply {
            text = message
        }
        val resultado = intent.getStringExtra("resultado")
        val textView2 = findViewById<TextView>(R.id.textView15).apply {
            text = resultado
        }
        val imageView = findViewById<ImageView>(R.id.ImageView)
        val tb1 = findViewById<TableRow>(R.id.tb1)
        val tb2 = findViewById<TableRow>(R.id.tb2)
        val tb3 = findViewById<TableRow>(R.id.tb3)
        val tb4 = findViewById<TableRow>(R.id.tb4)
        val tb5 = findViewById<TableRow>(R.id.tb5)
        val tb6 = findViewById<TableRow>(R.id.tb6)
        val tb7 = findViewById<TableRow>(R.id.tb7)

        val valorImc = intent.getFloatExtra("imc", 4f)
        println(valorImc)
        if (valorImc < 18.5) {
            imageView.setBackgroundColor(Color.parseColor("#407E9B"))
            tb1.setBackgroundColor(Color.parseColor("#407E9B"))
            tb2.setBackgroundColor(Color.parseColor("#407E9B"))
            tb3.setBackgroundColor(Color.parseColor("#407E9B"))
            tb4.setBackgroundColor(Color.parseColor("#407E9B"))
            tb5.setBackgroundColor(Color.parseColor("#407E9B"))
            tb6.setBackgroundColor(Color.parseColor("#407E9B"))
            tb7.setBackgroundColor(Color.parseColor("#407E9B"))
        }else if (valorImc < 25){
            imageView.setBackgroundColor(Color.parseColor("#79EE3C"))
            tb1.setBackgroundColor(Color.parseColor("#79EE3C"))
            tb2.setBackgroundColor(Color.parseColor("#79EE3C"))
            tb3.setBackgroundColor(Color.parseColor("#79EE3C"))
            tb4.setBackgroundColor(Color.parseColor("#79EE3C"))
            tb5.setBackgroundColor(Color.parseColor("#79EE3C"))
            tb6.setBackgroundColor(Color.parseColor("#79EE3C"))
            tb7.setBackgroundColor(Color.parseColor("#79EE3C"))
        }else if (valorImc < 30){
            imageView.setBackgroundColor(Color.parseColor("#F7D639"))
            tb1.setBackgroundColor(Color.parseColor("#F7D639"))
            tb2.setBackgroundColor(Color.parseColor("#F7D639"))
            tb3.setBackgroundColor(Color.parseColor("#F7D639"))
            tb4.setBackgroundColor(Color.parseColor("#F7D639"))
            tb5.setBackgroundColor(Color.parseColor("#F7D639"))
            tb6.setBackgroundColor(Color.parseColor("#F7D639"))
            tb7.setBackgroundColor(Color.parseColor("#F7D639"))
        }else if (valorImc < 35){
            imageView.setBackgroundColor(Color.parseColor("#F78204"))
            tb1.setBackgroundColor(Color.parseColor("#F78204"))
            tb2.setBackgroundColor(Color.parseColor("#F78204"))
            tb3.setBackgroundColor(Color.parseColor("#F78204"))
            tb4.setBackgroundColor(Color.parseColor("#F78204"))
            tb5.setBackgroundColor(Color.parseColor("#F78204"))
            tb6.setBackgroundColor(Color.parseColor("#F78204"))
            tb7.setBackgroundColor(Color.parseColor("#F78204"))
        }else if (valorImc < 40){
            imageView.setBackgroundColor(Color.parseColor("#E62C2C"))
            tb1.setBackgroundColor(Color.parseColor("#E62C2C"))
            tb2.setBackgroundColor(Color.parseColor("#E62C2C"))
            tb3.setBackgroundColor(Color.parseColor("#E62C2C"))
            tb4.setBackgroundColor(Color.parseColor("#E62C2C"))
            tb5.setBackgroundColor(Color.parseColor("#E62C2C"))
            tb6.setBackgroundColor(Color.parseColor("#E62C2C"))
            tb7.setBackgroundColor(Color.parseColor("#E62C2C"))
        }else{
            imageView.setBackgroundColor(Color.parseColor("#FF0000"))
            tb1.setBackgroundColor(Color.parseColor("#FF0000"))
            tb2.setBackgroundColor(Color.parseColor("#FF0000"))
            tb3.setBackgroundColor(Color.parseColor("#FF0000"))
            tb4.setBackgroundColor(Color.parseColor("#FF0000"))
            tb5.setBackgroundColor(Color.parseColor("#FF0000"))
            tb6.setBackgroundColor(Color.parseColor("#FF0000"))
            tb7.setBackgroundColor(Color.parseColor("#FF0000"))
        }
    }
    fun goBack(view: View){
        finish()
    }
}

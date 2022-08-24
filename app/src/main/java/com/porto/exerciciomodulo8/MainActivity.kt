package com.porto.exerciciomodulo8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    var nome: TextView? = null
    var digitarNome: EditText? = null
    var tela : LinearLayoutCompat? = null
    var button: Button?=null
    var numclicks = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nome = findViewById(R.id.Nome)
        digitarNome = findViewById(R.id.DigitarNome)
        tela = findViewById(R.id.tela)
        button = findViewById(R.id.button)

        button?.setOnClickListener {
            numclicks++
            changeTitle()
        }


    }
    fun changeTitle(){

        if(numclicks %2 == 0 ){
            tela?.background = getDrawable(R.drawable.chopper)
            digitarNome?.addTextChangedListener {
                nome?.text=it?.toString() + numclicks.toString()
            }
        }else{
            tela?.background = getDrawable(R.drawable.teste)
            digitarNome?.addTextChangedListener {
                nome?.text=it?.toString() + numclicks.toString()
            }
        }

    }
}
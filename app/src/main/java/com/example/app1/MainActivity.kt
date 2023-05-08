package com.example.app1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val numero1 = findViewById<EditText>(R.id.editNumero1)
        val numero2 = findViewById<EditText>(R.id.editNumero2)

        val resultado = findViewById<TextView>(R.id.textView)
        val botonSuma = findViewById<Button>(R.id.buttonSuma)
        val botonResta = findViewById<Button>(R.id.buttonResta)
        val botonMult = findViewById<Button>(R.id.buttonMulti)
        val botonDiv = findViewById<Button>(R.id.buttonDiv)

        //Toast.makeText(this, "Hola mundo", Toast.LENGTH_SHORT).show()

        botonSuma.setOnClickListener{
            if(TextUtils.isEmpty(numero1.text.toString())||TextUtils.isEmpty(numero2.text.toString())){
                Toast.makeText(this, "Alguno de los campos esta vacio", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                resultado.text = ""+sumar(numero1.text.toString().toFloat(),numero2.text.toString().toFloat())
            }

        }
        botonResta.setOnClickListener{
            if(TextUtils.isEmpty(numero1.text.toString())||TextUtils.isEmpty(numero2.text.toString())){
                Toast.makeText(this, "Alguno de los campos esta vacio", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                resultado.text = ""+restar(numero1.text.toString().toFloat(),numero2.text.toString().toFloat())
            }
        }
        botonDiv.setOnClickListener{
            if(TextUtils.isEmpty(numero1.text.toString())||TextUtils.isEmpty(numero2.text.toString())){
                Toast.makeText(this, "Alguno de los campos esta vacio", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                resultado.text = ""+dividir(numero1.text.toString().toFloat(),numero2.text.toString().toFloat())
            }
        }
        botonMult.setOnClickListener{
            if(TextUtils.isEmpty(numero1.text.toString())||TextUtils.isEmpty(numero2.text.toString())){
                Toast.makeText(this, "Alguno de los campos esta vacio", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                resultado.text = ""+multiplicar(numero1.text.toString().toFloat(),numero2.text.toString().toFloat())
            }
        }
    }
}
fun sumar(numero1: Float,numero2: Float): Float {
    return numero1+numero2
}
fun restar(numero1: Float,numero2: Float): Float{
    return numero1-numero2
}
fun dividir(numero1: Float,numero2: Float): Float{
    return numero1/numero2
}
fun multiplicar(numero1: Float,numero2: Float): Float{
    return numero1*numero2
}
//Metodo visto en clase:
/*
fun operacionesBasicas(boton: View){
    when(boton.id){
        R.id."Boton" -> sumar()
    }

}


    lateinit var numero1 : EditText
*/

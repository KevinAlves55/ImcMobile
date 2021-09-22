package com.example.imc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
            Link para parte do layout com nosso código

            val = criação da variável

            val editPeso = findViewById<EditText>(R.id.edit_peso)
            val buttonCalcular = findViewById<Button>(R.id.btn_calular)

            Evento de click para botão
            buttonCalcular.setOnClickListener {
                Toast.makeText(this, "editPeso.text.toString()", Toast.LENGTH_SHORT).show()
        }*/

        /*

            Declarações de Variáveis em Kotlin

            Sintaxe:

            val x = 10 (Não precisamos declarar o tipo de uma em Kotlin variável)
            var x = 10

            A diferença entre val ou var é que um cria uma constante e o outro permite trocar ao decorrer do site

        */

        // Capturando as variáveis que vamos manipular, usando nome da variável que queremos, usamos a captura e depois o id do elemento
        val peso = findViewById<EditText>(R.id.edit_peso)
        val altura = findViewById<EditText>(R.id.edit_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calular)
        val result = findViewById<TextView>(R.id.resultado)

        // Adicionar um ouvinte de click no botão
        btnCalcular.setOnClickListener {

            if (peso.text.isEmpty()) {
                peso.error = "Campo obrigatório!"
            } else if (altura.text.isEmpty()) {
                altura.error = "Campo obrigatório"
            } else {
                val peso = peso.text.toString().toInt()
                val altura = altura.text.toString().toDouble()

                val imc = peso / (altura * altura)

                result.text = String.format("%.1f", imc) // Convertemos para podemos ser aceito no TextView
            }



        }


    }
}
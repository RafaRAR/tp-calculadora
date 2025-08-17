package br.unisanta.appsoma

import android.os.Bundle
import android.widget.*

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val edtNum1 = findViewById<EditText>(R.id.edt_Num1)
        val edtNum2 = findViewById<EditText>(R.id.edt_Num2)
        val btnSomar = findViewById<Button>(R.id.btn_somar)
        val btnSubtrair = findViewById<Button>(R.id.btn_subtrair)
        val btnMultiplicar = findViewById<Button>(R.id.btn_multiplicar)
        val btnDividir = findViewById<Button>(R.id.btn_dividir)
        val txvResultado = findViewById<TextView>(R.id.txv_resultado)

        btnSomar.setOnClickListener {
            val valor1 = edtNum1.text.toString().toFloat()
            val valor2 = edtNum2.text.toString().toFloat()
            val resultado = valor1+valor2
            txvResultado.text = "A soma é: $resultado"

        }

        btnSubtrair.setOnClickListener {
            val valor1 = edtNum1.text.toString().toFloat()
            val valor2 = edtNum2.text.toString().toFloat()
            val resultado = valor1-valor2
            txvResultado.text = "A subtração é: $resultado"
        }


        btnMultiplicar.setOnClickListener {
            val valor1 = edtNum1.text.toString().toFloat()
            val valor2 = edtNum2.text.toString().toFloat()
            val resultado = valor1*valor2
            txvResultado.text = "A multiplicação é: $resultado"
        }

        btnDividir.setOnClickListener {
           val valor1 = edtNum1.text.toString().toFloat()
            val valor2 = edtNum2.text.toString().toFloat()
            val resultado = valor1/valor2
            txvResultado.text = "A divisão é: $resultado"


        }




    }
}

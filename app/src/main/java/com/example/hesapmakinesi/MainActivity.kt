package com.example.hesapmakinesi

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var currentInput = ""
    var firstNumber = 0
    var operator = ""
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView2)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button0 = findViewById<Button>(R.id.button0)

        val buttonAdd = findViewById<Button>(R.id.buttonAdd)



        button1.setOnClickListener {
            currentInput += "1"
            textView.text = currentInput
        }

        button2.setOnClickListener {
            currentInput += "2"
            textView.text = currentInput
        }

        button3.setOnClickListener {
            currentInput += "3"
            textView.text = currentInput
        }

        button4.setOnClickListener {
            currentInput += "4"
            textView.text = currentInput
        }

        button5.setOnClickListener {
            currentInput += "5"
            textView.text = currentInput
        }

        button6.setOnClickListener {
            currentInput += "6"
            textView.text = currentInput
        }

        button7.setOnClickListener {
            currentInput += "7"
            textView.text = currentInput
        }

        button8.setOnClickListener {
            currentInput += "8"
            textView.text = currentInput
        }

        button9.setOnClickListener {
            currentInput += "9"
            textView.text = currentInput
        }

        button0.setOnClickListener {
            currentInput += "0"
            textView.text = currentInput
        }

        findViewById<Button>(R.id.buttonAdd).setOnClickListener {
            operator = "+"
            firstNumber = currentInput.toIntOrNull() ?: 0
            currentInput = ""
            textView.text = ""
        }

        findViewById<Button>(R.id.buttonSubtract).setOnClickListener {
            operator = "-"
            firstNumber = currentInput.toIntOrNull() ?: 0
            currentInput = ""
            textView.text = ""
        }

        findViewById<Button>(R.id.buttonMultiply).setOnClickListener {
            operator = "*"
            firstNumber = currentInput.toIntOrNull() ?: 0
            currentInput = ""
            textView.text = ""
        }

        findViewById<Button>(R.id.buttonDivide).setOnClickListener {
            operator = "/"
            firstNumber = currentInput.toIntOrNull() ?: 0
            currentInput = ""
            textView.text = ""
        }

        findViewById<Button>(R.id.buttonClear).setOnClickListener {
            currentInput = ""
            firstNumber = 0
            operator = ""
            textView.text = "0"
        }

        findViewById<Button>(R.id.buttonEquals).setOnClickListener {
            val secondNumber = currentInput.toIntOrNull() ?: 0
            val result = when (operator){
                "+" -> firstNumber + secondNumber
                "-" -> firstNumber - secondNumber
                "*" -> firstNumber * secondNumber
                "/" -> firstNumber / secondNumber
                else -> "Hata!"
            }
            textView.text = result.toString()
            currentInput = result.toString()
        }

    }
}

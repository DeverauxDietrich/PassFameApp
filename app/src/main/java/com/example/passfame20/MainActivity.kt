package com.example.passfame20

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    data class FamousPerson(val name: String, val age: Int)

    private val famousPeople = listOf(
        FamousPerson("W.A. Mozart", 35),
        FamousPerson("Cleopatra", 39),
        FamousPerson("Napoleon", 52),
        FamousPerson("Columbus", 55),
        FamousPerson("Julius Caesar", 56),
        FamousPerson("Adolf Hitler", 56),
        FamousPerson("Martin Luther", 63),
        FamousPerson("Leonardo da Vinci", 67),
        FamousPerson("Mahatma Gandhi", 78),
        FamousPerson("Albert Einstein", 76)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputAge = findViewById<EditText>(R.id.inputAge)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        submitButton.setOnClickListener {
            val age = inputAge.text.toString().toIntOrNull()
            if (age == null || age !in 20..100) {
                Toast.makeText(this, "Please enter a valid age between 20 and 100", Toast.LENGTH_SHORT).show()
            } else {
                val famousPerson = famousPeople.find { it.age == age }
                if (famousPerson != null) {
                    resultText.text = "Famous person: ${famousPerson.name}"
                } else {
                    resultText.text = "No famous person found for age $age"
                }
            }
        }

        clearButton.setOnClickListener {
            inputAge.text.clear()
            resultText.text = ""
        }
    }
}
package com.sectorone.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnSubmit: Button
    private lateinit var btnClear: Button
    private lateinit var fieldName: EditText
    private lateinit var stringName: String
    private lateinit var textDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Hello Kotlin" // set header title

        btnSubmit = findViewById(R.id.buttonSubmit)
        btnClear = findViewById(R.id.buttonClear)
        fieldName = findViewById(R.id.fieldInputName)
        textDisplay = findViewById(R.id.textDisplay)

        btnSubmit.setOnClickListener {
            if (TextUtils.isEmpty(fieldName.text.toString())) {
                Toast.makeText(this, "Empty field not allowed!", Toast.LENGTH_SHORT).show()
            } else {
                stringName = fieldName.text.toString()
                textDisplay.text = stringName
            }
        }

        btnClear.setOnClickListener {
            if (TextUtils.isEmpty(fieldName.text.toString())) {
                Toast.makeText(this, "Got nothing to clear here!", Toast.LENGTH_SHORT).show()
            } else {
                fieldName.text.clear().toString()
            }
        }
    }
}
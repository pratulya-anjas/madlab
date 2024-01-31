package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var checkBoxPizza: CheckBox
    private lateinit var checkBoxBurger: CheckBox
    // Declare more CheckBox variables for other food items

    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBoxPizza = findViewById(R.id.checkBoxPizza)
        checkBoxBurger = findViewById(R.id.checkBoxBurger)
        // Initialize other CheckBox variables

        submitButton = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            displayOrder()
            disableCheckboxes()
        }
    }

    private fun displayOrder() {
        val orderStringBuilder = StringBuilder("Ordered Items:\n")
        var totalCost = 0.0

        if (checkBoxPizza.isChecked) {
            orderStringBuilder.append("Pizza - $10.99\n")
            totalCost += 10.99
        }

        if (checkBoxBurger.isChecked) {
            orderStringBuilder.append("Burger - $8.99\n")
            totalCost += 8.99
        }

        // Add similar code for other food items

        orderStringBuilder.append("\nTotal Cost: $$totalCost")

        showToast(orderStringBuilder.toString())
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    private fun disableCheckboxes() {
        checkBoxPizza.isEnabled = false
        checkBoxBurger.isEnabled = false
        // Disable other checkboxes
    }
}

package com.example.assignment_iii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var waterResourceName: EditText
    private lateinit var location: EditText
    private lateinit var type: EditText
    private lateinit var capacity: EditText
    private lateinit var addButton: Button
    private lateinit var tableLayout: TableLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        waterResourceName = findViewById(R.id.waterResourceName)
        location = findViewById(R.id.location)
        type = findViewById(R.id.type)
        capacity = findViewById(R.id.capacity)
        addButton = findViewById(R.id.addButton)
        tableLayout = findViewById(R.id.tableLayout)

        addButton.setOnClickListener {
            addRowToTable()
        }
    }

    private fun addRowToTable() {
        val name = waterResourceName.text.toString().trim()
        val loc = location.text.toString().trim()
        val typ = type.text.toString().trim()
        val cap = capacity.text.toString().trim()

        if (name.isEmpty() || loc.isEmpty() || typ.isEmpty() || cap.isEmpty()) {
            return
        }

        val tableRow = LayoutInflater.from(this).inflate(R.layout.table_row, null) as TableRow
        (tableRow.getChildAt(0) as TextView).text = name
        (tableRow.getChildAt(1) as TextView).text = loc
        (tableRow.getChildAt(2) as TextView).text = typ
        (tableRow.getChildAt(3) as TextView).text = cap

        tableLayout.addView(tableRow)

        // Clear input fields after adding
        waterResourceName.setText("")
        location.setText("")
        type.setText("")
        capacity.setText("")
    }
}
package com.example.assignment_iii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var versionEditText: EditText
    private lateinit var codeEditText: EditText
    private lateinit var table: TableLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        versionEditText = findViewById(R.id.version)
        codeEditText = findViewById(R.id.code)
        table = findViewById(R.id.table)
    }

    fun add(view: View) {
        val version = versionEditText.text.toString()
        val code = codeEditText.text.toString()

        val tableRow = TableRow(this)
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.layoutParams = layoutParams
//        Table
        val versionText = TextView(this)
        versionText.text = version
        versionText.setPadding(5, 5, 5, 5)
        val codeText = TextView(this)
        codeText.setPadding(5, 5, 5, 5)
        codeText.text = code
        tableRow.addView(versionText)
        tableRow.addView(codeText)
        table.addView(tableRow)
    }
}
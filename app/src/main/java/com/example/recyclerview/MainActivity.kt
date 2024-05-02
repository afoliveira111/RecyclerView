package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Create Data Class
        // Create List From data class
        // Create adapter
        // Set adapter
        // Liner Layout Manager

        val rvList = findViewById<RecyclerView>(R.id.rv_list)

    }
}

val contacts = listOf(
    Contact(
        "Felipe",
        "(55) 21 982688822",
        R.drawable.sample12
    ),
    Contact(
        "Maria",
        "(55) 21 9988776655",
        R.drawable.sample1
    ),
    Contact(
        "Felix",
        "(55) 21 9966885522",
        R.drawable.sample2
    ),
    Contact(
        "Joana",
        "(55) 21 955882233",
        R.drawable.sample4
    ),
    Contact(
        "Mariana",
        "(55) 21 987445566",
        R.drawable.sample5
    ),
    Contact(
        "Francisca",
        "(55) 21 933998855",
        R.drawable.sample6
    ),
    Contact(
        "Lais",
        "(55) 21 983901789",
        R.drawable.sample7
    ),
    Contact(
        "Felipe3",
        "(55) 21 982688822",
        R.drawable.sample12
    ),
    Contact(
        "Felipe4",
        "(55) 21 982688822",
        R.drawable.sample12
    ),
    Contact(
        "Felipe5",
        "(55) 21 982688822",
        R.drawable.sample12
    ),
    Contact(
        "Felipe6",
        "(55) 21 982688822",
        R.drawable.sample12
    ),
    Contact(
        "Felipe7",
        "(55) 21 982688822",
        R.drawable.sample12
    ),
    Contact(
        "Felipe8",
        "(55) 21 982688822",
        R.drawable.sample12
    ),
    Contact(
        "Felipe9",
        "(55) 21 982688822",
        R.drawable.sample12
    ),
    Contact(
        "Felipe00",
        "(55) 21 982688822",
        R.drawable.sample12
    ),

)



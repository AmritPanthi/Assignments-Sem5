//package com.amrit.userprofile
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.AdapterView
//import android.widget.ArrayAdapter
//import android.widget.Spinner
//
//class SpinnerActivity : AppCompatActivity() {
//    private val languages = arrayOf("Nepali", "Hindi", "English", "Chinese")
//    private lateinit var spinner: Spinner
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_spinner)
//
//        spinner = findViewById(R.id.spinner)
//
//        //Array Adapter
//        val adapter = ArrayAdapter(
//                this,
//                android.R.layout.simple_list_item_1,
//                languages
//        )
//        spinner.adapter = adapter
//
//        spinner.onItemClickListener = object : AdapterView.
//
//
//    }
//}
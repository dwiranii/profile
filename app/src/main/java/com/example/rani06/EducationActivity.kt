package com.example.rani06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {

    lateinit var EducationView: RecyclerView
    lateinit var EducationAdapter: SchoolAdapter
    val list = ArrayList<SchoolData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        EducationView = findViewById(R.id.rveducation)
        EducationView.layoutManager = LinearLayoutManager(this)

        list.add(SchoolData("SDN Tambak roto", "Jl Tambak Roto"))
        list.add(SchoolData("SMN 2 sayung", "Jl Sayung"))
        list.add(SchoolData("SMK 1 Sayung", "Jl.Raya Semarang-Dmak"))

        EducationAdapter = SchoolAdapter(list)
        EducationView.adapter = EducationAdapter
    }
}
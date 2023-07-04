package com.rhbekti.daftarpeserta

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    internal var TAG = MainActivity::class.java.simpleName

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapater: MyCustomAdapter
    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try{
            context = this
            recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view) as RecyclerView
            recyclerView.layoutManager = GridLayoutManager(this,1)

            val persons = ArrayList<Person>()
            persons.add(Person("Rahman"))
            persons.add(Person("Pambekti"))
            persons.add(Person("Tika"))
            persons.add(Person("Yanti"))
            persons.add(Person("Antika"))
            persons.add(Person("Fani"))
            persons.add(Person("Faqih"))
            persons.add(Person("Bekti"))

            adapater = MyCustomAdapter(persons,{person -> personItemClicked(person)})
            recyclerView.adapter = adapater
        }catch (e: Exception){
            Log.e(TAG,e.message.toString())
        }
    }

    private fun personItemClicked(person: Person){
        Toast.makeText(this,"Clicked : ${person.name}",Toast.LENGTH_SHORT).show()
    }
}
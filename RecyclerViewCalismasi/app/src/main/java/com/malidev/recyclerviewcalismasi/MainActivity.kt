package com.malidev.recyclerviewcalismasi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.malidev.recyclerviewcalismasi.model.SuperKahramanModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var batman = SuperKahramanModel("Batman",R.drawable.batman)
        var ironman = SuperKahramanModel("Iron Man", R.drawable.ironman)
        var thor = SuperKahramanModel("Thor",R.drawable.thor)

        var superKahramanList = ArrayList<SuperKahramanModel>()
        superKahramanList.add(batman)
        superKahramanList.add(ironman)
        superKahramanList.add(thor)

        val layoutManager = LinearLayoutManager (this@MainActivity)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superKahramanList)
        recyclerView.adapter = adapter
    }
}
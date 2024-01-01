package com.malidev.recyclerviewcalismasi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val intent = intent
        val secilenKahramanIsmi = intent.getStringExtra("isim")
        textView.text = secilenKahramanIsmi

        val secilenKahramanFoto = intent.getIntExtra("fotografId",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,secilenKahramanFoto)
        imageView.setImageBitmap(bitmap)



    }
}
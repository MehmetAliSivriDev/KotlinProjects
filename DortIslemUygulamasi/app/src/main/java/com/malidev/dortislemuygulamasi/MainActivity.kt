package com.malidev.dortislemuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var sayi1 : Double? = null
    var sayi2 : Double? = null

    fun topla(view:View){

        sayi1 = sayi1Text.text.toString().toDoubleOrNull()
        sayi2 = sayi2Text.text.toString().toDoubleOrNull()

        if(sayi1 != null || sayi2 != null){

            sonucText.text = "Sonuç: ${sayi1!! + sayi2!!}"
        }
        else{
            sonucText.text = "Lütfen Sayıları Düzgün Bir Şekilde Formata Uygun Giriniz."
        }

    }

    fun cikar(view:View){

        sayi1 = sayi1Text.text.toString().toDoubleOrNull()
        sayi2 = sayi2Text.text.toString().toDoubleOrNull()

        if(sayi1 != null || sayi2 != null){

            sonucText.text = "Sonuç: ${sayi1!! - sayi2!!}"
        }
        else{
            sonucText.text = "Lütfen Sayıları Düzgün Bir Şekilde Formata Uygun Giriniz."
        }

    }

    fun carp(view:View){

        sayi1 = sayi1Text.text.toString().toDoubleOrNull()
        sayi2 = sayi2Text.text.toString().toDoubleOrNull()

        if(sayi1 != null || sayi2 != null){

            sonucText.text = "Sonuç: ${sayi1!! * sayi2!!}"
        }
        else{
            sonucText.text = "Lütfen Sayıları Düzgün Bir Şekilde Formata Uygun Giriniz."
        }

    }

    fun bol(view:View){

        sayi1 = sayi1Text.text.toString().toDoubleOrNull()
        sayi2 = sayi2Text.text.toString().toDoubleOrNull()

        if(sayi1 != null || sayi2 != null){

            sonucText.text = "Sonuç: ${sayi1!! / sayi2!!}"
        }
        else{
            sonucText.text = "Lütfen Sayıları Düzgün Bir Şekilde Formata Uygun Giriniz."
        }

    }

}
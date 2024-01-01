package com.malidev.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun superKahramanYap(view: View){

        val isim = isimText.text.toString()
        val yas = yasText.text.toString().toIntOrNull()
        val meslek = meslekText.text.toString()

        if(yas != null){

            val kahraman = Superkahraman(isim,yas,meslek)
            sonucText.text = "Süper Kahraman Bilgileri\nİsim:${kahraman.isim}\nYaş:${kahraman.yas}\nMeslek:${kahraman.meslek}"

        }
        else {
            sonucText.text = "Yaş Formatını Doğru Giriniz Lütfen."
        }

    }

    fun temizle(view: View){
        isimText.text.clear()
        yasText.text.clear()
        meslekText.text.clear()

        sonucText.text = "Süper Kahraman Bilgileri\nİsim: \nYaş: \nMeslek: "
    }

}
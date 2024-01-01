package com.malidev.sharedpreferencescalismasi

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit  var sharedPreferences : SharedPreferences
    var kaydedilmisVeri : String ? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = this.getSharedPreferences("com.malidev.sharedpreferencescalismasi",
            MODE_PRIVATE)

        kaydedilmisVeri = sharedPreferences.getString("kaydedilecekVeri","")

        if(kaydedilmisVeri != null){
            kaydedilenVeri.text = "Kaydedilen Veri : ${kaydedilmisVeri}"
        }
    }

    fun kaydet(view: View){
        var veri = kullaniciGirdisi.text.toString()

        if(veri == ""){
            Toast.makeText(this@MainActivity, "Lütfen Kaydedilecek Bir Veri Giriniz",Toast.LENGTH_LONG).show()
        }
        else{
            sharedPreferences.edit().putString("kaydedilecekVeri",veri).apply()
            kaydedilenVeri.text = "Kaydedilen Veri : ${veri}"
            Toast.makeText(this@MainActivity,"Veriniz Başarıyla Kaydedildi",Toast.LENGTH_LONG).show()
        }

    }

    fun sil (view: View){

        if(kaydedilmisVeri != null && !kaydedilmisVeri.equals("")){
            kaydedilenVeri.text = "Kaydedilen Veri :"
            sharedPreferences.edit().remove("kaydedilecekVeri").apply()
            Toast.makeText(this@MainActivity,"Kaydedilen Veriniz Başarıyla Silinmiştir.",Toast.LENGTH_LONG).show()
        }

    }
}
package com.malidev.sqliteogrenmeprojesi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {

            val veritabani = this.openOrCreateDatabase("Urunler", Context.MODE_PRIVATE,null)
            veritabani.execSQL("CREATE TABLE IF NOT EXISTS urunler (id INTEGER PRIMARY KEY, isim VARCHAR, fiyat INT)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('Ayakkabı',100)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('Telefon',3000)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('Kitap',50)")

            //veritabani.execSQL("DELETE FROM urunler WHERE id = 3")
            //veritabani.execSQL("UPDATE urunler SET fiyat = 1000 WHERE id = 1")


            val cursor = veritabani.rawQuery("SELECT * FROM urunler",null)

            val idColumnIndex = cursor.getColumnIndex("id")
            val isimColumnIndex = cursor.getColumnIndex("isim")
            val fiyatColumnIndex = cursor.getColumnIndex("fiyat")

            while(cursor.moveToNext()) {

                println("ID:${cursor.getInt(idColumnIndex)}")
                println("Isim:${cursor.getString(isimColumnIndex)}")
                println("Fiyat:${cursor.getInt(fiyatColumnIndex)}")
            }
            cursor.close()

        }catch (e : Exception){
            e.printStackTrace()
        }
    }
}
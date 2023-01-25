package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songList = findViewById<RecyclerView>(R.id.songList)
        //val songs= listOf<String>("Hello","ABCD","Dance","Chill","Coders Life","Quarantine","Aman","Aditya","Raj Vardhan","Prasoon","Coders"," Programmer","Designer","Classmates")


        val songObjects= mutableListOf<Song>()
        songObjects.add(Song("Hello","Just the description"))
        songObjects.add(Song("ABCD","John Lemon"))
        songObjects.add(Song("Dance","The rolling stones"))
        songObjects.add(Song("Chill","The Beatles"))
        songObjects.add(Song("Coder's life","Just the description"))
        songObjects.add(Song("Adayien bhi hain mohabbat bhi hai","OK Jaanu"))
        songObjects.add(Song("Aye udi udi","Saathiya"))
        songObjects.add(Song("Enna Sona","Random Data"))
        songObjects.add(Song("IT IT IT","Hello"))
        songObjects.add(Song("Agar tum mil jaao","OK jaanu"))
        songObjects.add(Song("Ban jaa Rani","Sulu"))
        songObjects.add(Song("Jaane Kaise","Sanam Malik"))


        songList.adapter=MyAdapter(songObjects)
        songList.layoutManager=LinearLayoutManager(this)

    }
}
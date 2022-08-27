package com.example.recyclerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.main_recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        val listOfCharacters = getListOfCharacters()
        val charactersAdapter = CharactersAdapter(listOfCharacters)

        recyclerView.adapter = charactersAdapter
    }


    private fun getListOfCharacters(): List<Character> {
        val characters = mutableListOf<Character>()
        characters.add(Character("SpiderMan", R.drawable.spider_man, null))
        characters.add(Character("Captain America", R.drawable.cap_america, null))
        characters.add(Character("Hulk", R.drawable.hulk, null))
        characters.add(Character("Iron man", R.drawable.iron_man, null))
        characters.add(Character("The Capetian", R.drawable.the_captain, null))
        characters.add(Character("Captain America 2", R.drawable.captain_america_poster, null))

        characters.add(Character("Hulk", R.drawable.hulk, null))
        characters.add(Character("Iron man", R.drawable.iron_man, null))
        characters.add(Character("The Capetian", R.drawable.the_captain, null))

        characters.add(Character("SpiderMan", R.drawable.spider_man, null))
        characters.add(Character("Captain America", R.drawable.cap_america, null))
        characters.add(Character("Hulk", R.drawable.hulk, null))
        characters.add(Character("Iron man", R.drawable.iron_man, null))
        characters.add(Character("The Capetian", R.drawable.the_captain, null))
        characters.add(Character("Captain America 2", R.drawable.captain_america_poster, null))

        characters.add(Character("Hulk", R.drawable.hulk, null))
        characters.add(Character("Iron man", R.drawable.iron_man, null))
        characters.add(Character("The Capetian", R.drawable.the_captain, null))

        characters.add(Character("SpiderMan", R.drawable.spider_man, null))
        characters.add(Character("Captain America", R.drawable.cap_america, null))
        characters.add(Character("Hulk", R.drawable.hulk, null))
        characters.add(Character("Iron man", R.drawable.iron_man, null))
        characters.add(Character("The Capetian", R.drawable.the_captain, null))
        characters.add(Character("Captain America 2", R.drawable.captain_america_poster, null))

        characters.add(Character("Hulk", R.drawable.hulk, null))
        characters.add(Character("Iron man", R.drawable.iron_man, null))
        characters.add(Character("The Capetian", R.drawable.the_captain, null))
        return characters
    }

}
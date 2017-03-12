package com.example.android.dictanhvietbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Khai bao mang
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Dog", "Chó", R.drawable.animal_dog));
        words.add(new Word("Cat", "Mèo", R.drawable.animal_cat));
        words.add(new Word("Chicken","Gà", R.drawable.animal_chicken));
        words.add(new Word("Monkey", "Khỉ", R.drawable.animal_monkey));

        WordAdapter adapterAnimal = new WordAdapter(this, words, R.color.category_animal);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapterAnimal);
    }
}

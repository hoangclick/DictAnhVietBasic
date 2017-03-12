package com.example.android.dictanhvietbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Khoi tao mot mang
        ArrayList<Word> words = new ArrayList<Word>();
        // them cac phan tu vao mang
        words.add(new Word("Father", "Bố", R.drawable.family_father));
        words.add(new Word("Mother", "Mẹ", R.drawable.family_mother));


        // tao mot adapter
        WordAdapter adapterFamily = new WordAdapter(this, words, R.color.category_family);
        // tao mot doi tuong list view
        ListView listView = (ListView) findViewById(R.id.list);
        //Gan cac danh sach vao listview
        listView.setAdapter(adapterFamily);
    }
}

package com.example.android.dictanhvietbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red", "Màu đỏ", R.drawable.color_red));
        words.add(new Word("Green", "Màu Xanh", R.drawable.color_green));
        words.add(new Word("Brown", "Màu Nâu", R.drawable.color_brown));
        words.add(new Word("Gray", "Màu Xán", R.drawable.color_gray));
        words.add(new Word("Black", "Màu đen", R.drawable.color_black));
        words.add((new Word("White", "Màu trắng", R.drawable.color_white)));
        words.add(new Word("dusty yellow", "Màu Vàng nhạt", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow", "Màu vàng đậm", R.drawable.color_mustard_yellow));

        WordAdapter adapterColor = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapterColor);
    }
}
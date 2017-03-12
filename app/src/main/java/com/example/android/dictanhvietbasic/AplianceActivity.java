package com.example.android.dictanhvietbasic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AplianceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Chair", "Cái ghế", R.drawable.apliance_ghe));
        words.add(new Word("Freeze", "Tủ Lạnh", R.drawable.apliance_tulanh));
        words.add(new Word("Bed", "Giường", R.drawable.apliance_giuong));

        WordAdapter adapterApliance = new WordAdapter(this, words, R.color.category_apliance);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapterApliance);
    }
}

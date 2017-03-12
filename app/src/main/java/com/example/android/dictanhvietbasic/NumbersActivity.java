package com.example.android.dictanhvietbasic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("One");
        // Word w = new Word("One", "Lutti");
        words.add(new Word("One", "1", R.drawable.number_one));  // thay vi phai viet Word w = new Word("One", "Lutti");
        words.add(new Word("Two", "2", R.drawable.number_two));
        words.add(new Word("Three", "3", R.drawable.number_three));
        words.add(new Word("Four", "4", R.drawable.number_four));
        words.add(new Word("Five", "5", R.drawable.number_five));
        words.add((new Word("Six", "6", R.drawable.number_six)));
        words.add(new Word("Seven", "7", R.drawable.number_seven));
        words.add(new Word("Eight", "8", R.drawable.number_eight));
        words.add(new Word("Nine", "9", R.drawable.number_nine));
        words.add(new Word("Ten", "10", R.drawable.number_ten));


        // tạo một adapter
        // Xuong day cap nhat tiep <String> thanh <Word>
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers); // tao bien mau nen o day
        // tao mot doi tuong kieu listView
        ListView listView = (ListView) findViewById(R.id.list);
        // gan các danh sach vao listview
        listView.setAdapter(adapter);
    }
}

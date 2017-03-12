package com.example.android.dictanhvietbasic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.number);
        TextView family = (TextView) findViewById(R.id.family);
        TextView colors = (TextView) findViewById(R.id.colors);
        TextView apliance = (TextView) findViewById(R.id.apliance);
        TextView animals = (TextView) findViewById(R.id.animal);

        // set phuong thuc on click cho number
        numbers.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // tao ra mot intent moi
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Set phuong thuc on click cho gia dinh
        family.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Set phuong thuc on click cho mau sac
        colors.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorIntent);
            }
        });

        //Set phuong thuc on click cho do dung
        apliance.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent aplianceIntent = new Intent(MainActivity.this, AplianceActivity.class);
                startActivity(aplianceIntent);
            }
        });

        // Set phuong thuc on click cho dong vat
        animals.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent animalIntent = new Intent(MainActivity.this, AnimalActivity.class);
                startActivity(animalIntent);
            }
        });


    }
}

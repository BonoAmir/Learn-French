package com.example.android.learnfrench;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.graphics.Color.parseColor;

public class colorsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_layout);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ListView listView=(ListView) findViewById(R.id.list);

        listView.setBackgroundColor(parseColor("#F7CEC6"));


        ArrayList<word> numWords =new ArrayList<word>();


        numWords.add(new word("Red","Le Rouge",R.drawable.red));

        numWords.add(new word("Green","Le Vert",R.drawable.green));

        numWords.add(new word("Brown","Le Marron",R.drawable.brown));

        numWords.add(new word("Gray","Le Gris",R.drawable.gray));

        numWords.add(new word("Black","Le Noir",R.drawable.black));

        numWords.add(new word("Yellow","Le Jaune",R.drawable.yellow));

        numWords.add(new word("Blue","Le Bleu",R.drawable.blue));

        numWords.add(new word("Orange","L'Orange",R.drawable.orange));

        numWords.add(new word("White","Le Blanc",R.drawable.white));





        wordAdapter wordAdapter=new wordAdapter(this,numWords);








        listView.setAdapter(wordAdapter);








    }
}
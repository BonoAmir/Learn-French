package com.example.android.learnfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static android.graphics.Color.parseColor;

public class familyMemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_layout);
        ListView listView=(ListView) findViewById(R.id.list);

        listView.setBackgroundColor(parseColor("#C4DFC6"));



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        ArrayList<word> numWords= new ArrayList<word>();



        numWords.add(new word("Father","le père",R.drawable.father));

        numWords.add(new word("Mother","la mère",R.drawable.mother));

        numWords.add(new word("Sister","la soeur",R.drawable.sister));

        numWords.add(new word("Brother","le frère",R.drawable.brother));

        numWords.add(new word("Grandmother","la grand-mère",R.drawable.grandmother));

        numWords.add(new word("Grandfather","le grand-père",R.drawable.grandfather));




        wordAdapter wordAdapter=new wordAdapter (this,numWords);




        listView.setAdapter(wordAdapter);




    }
}

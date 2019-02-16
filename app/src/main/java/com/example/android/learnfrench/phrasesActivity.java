package com.example.android.learnfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import static android.graphics.Color.parseColor;

public class phrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_layout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listView=(ListView) findViewById(R.id.list);

       listView.setBackgroundColor(parseColor("#B9E5FA"));



        ArrayList<word> numWords=new ArrayList<word>();







        numWords.add(new word("The sun is yellow","Le soleil est jaune",R.drawable.sun));

        numWords.add(new word("The sea is blue","La mer est bleue",R.drawable.sea));

        numWords.add(new word("The night is black","La nuit est noire",R.drawable.night));

        numWords.add(new word("The snow is white","La neige est blanche",R.drawable.snow));

        numWords.add(new word("The grass is green","L'herbe est verte",R.drawable.grass));

        numWords.add(new word("The sunflowers are yellow","Les tournesols sont jaunes",R.drawable.sunflower));





        wordAdapter wordAdapter =new wordAdapter(this,numWords);





        listView.setAdapter(wordAdapter);

    }
}

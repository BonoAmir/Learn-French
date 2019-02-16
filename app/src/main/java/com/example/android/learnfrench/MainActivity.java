package com.example.android.learnfrench;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers=(TextView)findViewById(R.id.menu_numbers);
        TextView family_members=(TextView)findViewById(R.id.menu_family_members);
        TextView colors=(TextView)findViewById(R.id.menu_colors);
        TextView phrases=(TextView)findViewById(R.id.menu_phrases);


        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToNumbers = new Intent(MainActivity.this,numberActivity.class);
                startActivity(goToNumbers);

            }
        });



        family_members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToFamily = new Intent(MainActivity.this,familyMemberActivity.class);
                startActivity(goToFamily);

            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToColors = new Intent(MainActivity.this,colorsActivity.class);
                startActivity(goToColors);

            }
        });


        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToPhrases = new Intent(MainActivity.this,phrasesActivity.class);
                startActivity(goToPhrases);

            }
        });
    }


}

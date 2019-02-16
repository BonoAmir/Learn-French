package com.example.android.learnfrench;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class wordAdapter extends ArrayAdapter<word> {





    public wordAdapter(Context context, ArrayList<word> word) {
        super(context, 0, word);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }


         word wordpos = (word) getItem(position);

        TextView englishTrans = (TextView) listItemView.findViewById(R.id.eng);

        englishTrans.setText(wordpos.getmDEnglish());


        TextView frenchTrans = (TextView) listItemView.findViewById(R.id.french);

        frenchTrans.setText(wordpos.getmFrenchTrans());


        ImageView img = (ImageView) listItemView.findViewById(R.id.img);

        img.setImageResource(wordpos.getImageId());

        ImageView img2 =(ImageView)  listItemView.findViewById(R.id.play);



        if (wordpos.getAudioId() !=0){


            img2.setVisibility(View.VISIBLE);

        }

        else {
            img2.setVisibility(View.GONE);
        }



//make a new view and get the linearlayout  id then get the color passed to the constract and change color
//        View container=listItemView.findViewById(R.id.contianer);
//
//        int color = ContextCompat.getColor(getContext(), colorId);
//
//
//        container.setBackgroundColor(color);

//// if there is some activities without image , set the image view to gone
//        if (wordpos.getImageId() != 0) {
//            img.setImageResource(wordpos.getImageId());

//            img.setVisibility(View.VISIBLE);
//        }
//
//        else {
//            img.setVisibility(View.GONE);
//        }
//
        return listItemView;


    }
}

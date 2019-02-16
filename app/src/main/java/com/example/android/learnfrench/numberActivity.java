package com.example.android.learnfrench;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class numberActivity extends AppCompatActivity {

AudioManager audioManager;

    private MediaPlayer mMediaPlayer;

    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener=
            new AudioManager.OnAudioFocusChangeListener() {
                @Override
                public void onAudioFocusChange(int focusChange) {
                    if(focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK ){
                        mMediaPlayer.pause();
                        mMediaPlayer.seekTo(0);
                    }
                    else if (focusChange==AudioManager.AUDIOFOCUS_GAIN){
                        mMediaPlayer.start();
                    }
                    else if (focusChange==AudioManager.AUDIOFOCUS_LOSS){
                        mMediaPlayer.release();
                    }
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_layout);


            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);



        ListView listView=(ListView) findViewById(R.id.list);

        final ArrayList<word>numWords=new ArrayList<word>();










        numWords.add(new word("Zero","zéro",R.drawable.zero,R.raw.zero));

        numWords.add(new word("One","un",R.drawable.one,R.raw.one));

        numWords.add(new word("Two","deux",R.drawable.two,R.raw.two));

        numWords.add(new word("Three","trois",R.drawable.three,R.raw.thress));

        numWords.add(new word("Four","quatre",R.drawable.four,R.raw.four));

        numWords.add(new word("Five","cinq",R.drawable.five,R.raw.five));

        numWords.add(new word("Six","six",R.drawable.six,R.raw.six));

        numWords.add(new word("Seven","sept",R.drawable.seven,R.raw.seven));

        numWords.add(new word("Eight","huit",R.drawable.eight,R.raw.eigth));

        numWords.add(new word("Nine","neuf",R.drawable.nine,R.raw.nine));






        wordAdapter wordAdapter =new wordAdapter(this,numWords);



        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                word wrd = numWords.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word



               int requestAudioFoucs=audioManager.requestAudioFocus(onAudioFocusChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN);


               if(requestAudioFoucs==AudioManager.AUDIOFOCUS_REQUEST_GRANTED){

                   mMediaPlayer=MediaPlayer.create(numberActivity.this,wrd.getAudioId());

                   mMediaPlayer.start();

               }

                // Start the audio file

               mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                   @Override
                   public void onCompletion(MediaPlayer mp) {
                       relseaudio();
                   }
               });

            }

        });


    }

    @Override
    protected void onStop() {
        super.onStop();

        relseaudio();

    }


    public  void relseaudio(){

        if(mMediaPlayer !=null){

            mMediaPlayer.release();

            mMediaPlayer=null;

            audioManager.abandonAudioFocus(onAudioFocusChangeListener);

        }
    }
}

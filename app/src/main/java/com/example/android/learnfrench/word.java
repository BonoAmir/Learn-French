package com.example.android.learnfrench;



public class word {

    private String mEnglish;

    private String mFrenchTrans;


    private int audioId ;

    private int imageId ;


    public word(String word, String word2, int Id) {
        mEnglish = word;
        mFrenchTrans = word2;
        imageId = Id;

    }

    public word(String word, String word2, int imgId, int audio) {
        mEnglish = word;
        mFrenchTrans = word2;
        imageId = imgId;
        audioId=audio;


    }

//    if there is an activity without imageview it can use this constructor insted

//    public word(String word, String word2) {
//        mEnglish = word;
//        mFrenchTrans = word2;
//    }


    public String getmDEnglish() {
        return mEnglish;
    }

    public String getmFrenchTrans() {
        return mFrenchTrans;
    }


    public int getImageId() {
        return imageId;
    }



    public int getAudioId(){return audioId;}


}

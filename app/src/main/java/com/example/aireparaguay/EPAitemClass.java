package com.example.aireparaguay;

public class EPAitemClass {
    private int imageViewEPA;
    private String epaLabel;
    private String epaConcern;

    public EPAitemClass(int pImageView, String pEpaLabel, String pEpaConcern){
        imageViewEPA = pImageView;
        epaLabel = pEpaLabel;
        epaConcern = pEpaConcern;
    }
    public int getImageViewEPA(){
        return imageViewEPA;
    }
    public String getEpaLabel(){
        return epaLabel;
    }
    public String getEpaConcern(){
        return epaConcern;
    }
}

package com.example.aireparaguay;

public class ItemClass {
    private int imageView;
    private String cityAndDate;
    private String aqiValue;

    public ItemClass(int pImageView, String pCityAndDate, String pAqiValue){
        imageView = pImageView;
        cityAndDate = pCityAndDate;
        aqiValue = pAqiValue;
    }
    public int getImageView(){
        return imageView;
    }
    public String getCityAndDate(){
        return cityAndDate;
    }
    public String getAqiValue(){
        return aqiValue;
    }
}

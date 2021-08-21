package com.example.AireParaguay;

public class ItemClass {
    private int imageView;
    private String cityAndDate;
    private String aqiValue;
    private String dateTime;

    public ItemClass(int pImageView, String pCityAndDate, String pAqiValue, String pDateTime){
        imageView = pImageView;
        cityAndDate = pCityAndDate;
        aqiValue = pAqiValue;
        dateTime = pDateTime;
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
    public String getDateTime(){
        return dateTime;
    }
}

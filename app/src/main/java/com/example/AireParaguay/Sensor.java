package com.example.AireParaguay;

public class Sensor {
    int Image;
    String cityName;
    String aqiReading;
    String sensorName;
    String date;

    public Sensor(int image, String cityName, String aqiReading, String sensorName, String date) {
        Image = image;
        this.cityName = cityName;
        this.aqiReading = aqiReading;
        this.sensorName = sensorName;
        this.date = date;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAqiReading() {
        return aqiReading;
    }

    public void setAqiReading(String aqiReading) {
        this.aqiReading = aqiReading;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

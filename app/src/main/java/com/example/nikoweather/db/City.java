package com.example.nikoweather.db;

/**
 * Created by Nikos on 2018/11/19.
 */

public class City  {

    private int id;
    private String cityName;
    private int cityCode;
    private int proviceId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public int getProviceId(){
        return proviceId;
    }

    public void setProviceId(int proviceId){
        this.proviceId = proviceId;
    }
}

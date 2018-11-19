package com.example.nikoweather.db;

/**
 * Created by Nikos on 2018/11/19.
 */

public class Province {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }

}




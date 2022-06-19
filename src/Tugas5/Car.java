package com.src.Tugas5;

public class Car{
    private String carType;
    private String polNum;
    private String merk;
    private boolean status;

    Car(String carType, String polNum, String merk, Boolean status){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }

    public String getPolNum() {
        return polNum;
    }

    public String getMerk() {
        return merk;
    }

    public String getCarType() {
        return carType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = Boolean.parseBoolean(status);
    }
}

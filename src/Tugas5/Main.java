package com.src.Tugas5;

public class Main{
    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin Ming", 19, "080000000000");
        CarRider youhan = new CarRider("Bei Youhan", 20, "081111111111");
        CarRider ling = new CarRider("Ling'er", 31, "082222222222");
        CarRider adam = new CarRider("Adam Daffa", 20, "083333333333");


        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");
        data.addCar("SEDAN", "N 4444 AB", "Toyota");

        data.listOfCar();


        System.out.println("");
        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, CarData.carList.get(1), 9);
        arsip.Rent(youhan, CarData.carList.get(0), 3);
        arsip.Rent(ling, CarData.carList.get(1), 1);
        arsip.Rent(adam, CarData.carList.get(3), 7);

        System.out.println("");
        arsip.info();
    }
}

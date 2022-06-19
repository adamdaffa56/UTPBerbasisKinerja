package com.src.Tugas5;

import java.util.*;

public class CarData{
    public static ArrayList<Car> carList = new ArrayList<Car>();

    public void addCar(String carType, String polNum, String merk){
        Car car = new Car(carType, polNum, merk, true);

        carList.add(car);
    }

    public static void listOfCar(){
        System.out.println("-".repeat(36));
        System.out.println("            DAFTAR MOBIL");
        System.out.println("-".repeat(36));
        for (Car car : carList) {
            System.out.println("TIPE MOBIL : " + car.getCarType());
            System.out.println("NO. POLISI : " + car.getPolNum());
            System.out.println("MERK MOBIL : " + car.getMerk());
            System.out.println("-".repeat(36));
        }
    }
}

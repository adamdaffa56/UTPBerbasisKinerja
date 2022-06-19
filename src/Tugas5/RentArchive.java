package com.src.Tugas5;

import java.util.*;

public class RentArchive{
    private ArrayList<CarRent> rentData = new ArrayList<CarRent>();

    public void Rent(CarRider rider, Car car, int rentDur){
        CarRent carRent = new CarRent(rider, car, rentDur);
        if (car.isStatus() == true) {
            System.out.println("MOBIL "+car.getMerk().toUpperCase()+" BERHASIL DISEWA");
            rentData.add(carRent);
            car.setStatus(String.valueOf(false));
        }else{
            System.out.println("MAAF, MOBIL "+car.getMerk().toUpperCase()+" SUDAH DISEWA");
        }
    }

    public void info(){
        System.out.println("-".repeat(36));
        System.out.println("        INFORMASI  PELANGGAN");
        System.out.println("-".repeat(36));
        for (CarRent carRent : rentData) {
            System.out.println("NAMA PEMINJAM : " + carRent.getRider().getName());
            System.out.println("TIPE MOBIL    : " + carRent.getCar().getCarType());
            System.out.println("NO. POLISI    : " + carRent.getCar().getPolNum());
            System.out.println("LAMA RENTAL   : " + carRent.getRentDur());
            System.out.println("-".repeat(36));
        }
    }
}

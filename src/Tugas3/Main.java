package Tugas3;

import java.util.*;

public class Main {
    public static void main(String[] args){
        BajuErigo.tampilkanList();

        Scanner userInput = new Scanner(System.in);
        System.out.print("Baju yang akan anda beli bertipe       : ");
        String jenis = userInput.next();
        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        int jumlah = userInput.nextInt();

        BajuErigo baju = new BajuErigo(jenis, jumlah);
        baju.tampilkan();
    }
}


class BajuErigo{
    String jenis;
    int harga;
    int jumlah;

    public BajuErigo(String jenis, int jumlah){
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    final int hargaA = 100000;
    final int hargaB = 125000;
    final int hargaC = 175000;


    int diskonA() {
        if (jumlah > 100){
            harga = 95000;
        }else{
            harga = hargaA;
        }return harga;
    }

    int diskonB() {
        if (jumlah > 100){
            harga = 120000;
        }else{
            harga = hargaB;
        }return harga;
    }

    int diskonC() {
        if (jumlah > 100){
            harga = 160000;
        }else{
            harga = hargaC;
        }return harga;
    }

    static void  tampilkanList() {
        System.out.println("Baju yang tersedia : ");
        System.out.println("- Baju A dengan Harga 100000");
        System.out.println("- Baju B dengan Harga 125000");
        System.out.println("- Baju C dengan Harga 175000");
    }

     void tampilkan() {
        if (jenis.equalsIgnoreCase("a")){
            diskonA();
        }else if (jenis.equalsIgnoreCase("b")){
            diskonB();
        }else if (jenis.equalsIgnoreCase("c")){
            diskonC();
        }
        System.out.println("=======================================");
        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total Harga          : " + (harga * jumlah));
    }
}



package Tugas2;

import java.util.*;

public class menghitungLuas{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        byte pilihan = userInput.nextByte();
        switch (pilihan){
            case 1:
                Persegi persegi = new Persegi();
                persegi.sisi = userInput.nextInt();
                persegi.hitungPersegi(persegi.sisi);
                break;
            case 2:
                Segitiga segitiga = new Segitiga();
                segitiga.alas = userInput.nextInt();
                segitiga.tinggi = userInput.nextInt();
                segitiga.hitungSegitiga(segitiga.alas, segitiga.tinggi);
                break;
            case 3:
                Lingkaran lingkaran = new Lingkaran();
                lingkaran.r = userInput.nextInt();
                lingkaran.hitungLingkaran(lingkaran.r);
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }
}

class Persegi{
    int sisi;

    void hitungPersegi(int sisi) {
        int hasil = sisi * sisi;
        System.out.println(hasil);
    }
}

class Lingkaran{
    int r;

    void hitungLingkaran(int r){
        if (r % 7 == 0){
            double hasil = (int) (22/7 * Math.pow(r, 2));
            System.out.println((double) hasil);
        }else{
            double hasil = (int) (3.14 * Math.pow(r, 2));
            System.out.println((double) hasil);
        }
    }
}

class Segitiga{
    int alas, tinggi;

    void hitungSegitiga(int alas, int tinggi){
        int hasil = (alas * tinggi)/2;
        System.out.println(hasil);
    }
}


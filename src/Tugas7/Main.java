package com.src.Tugas7;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Pegawai> pegawai = new ArrayList<Pegawai>();

        pegawai.add(new PegawaiTetap("Bayu", "350728490327424892342", 2000000));
        pegawai.add(new PegawaiTetap("Adam", "350728490327424892345", 4500000));
        pegawai.add(new PegawaiTetap("Daffa", "350728490327424892346", 3000000));

        pegawai.add(new PegawaiHarian("Edo", "350728490327424892343", 8500, 40));
        pegawai.add(new PegawaiHarian("Aku", "350728490327424892347", 10000, 30));
        pegawai.add(new PegawaiHarian("Kamu", "350728490327424892348", 5000, 45));

        pegawai.add(new Sales("Tika", "350728490327424892344", 50, 50000));
        pegawai.add(new Sales("Hashirama", "350728490327424892349", 60, 55000));
        pegawai.add(new Sales("Madara", "350728490327424892341", 40, 40000));

        for (Pegawai value : pegawai){
            tampilkan(value);
            System.out.println("-".repeat(50));
        }
    }

    public static void tampilkan(Pegawai p){
        if (p instanceof PegawaiTetap){
            PegawaiTetap pegawaiTetap = (PegawaiTetap) p;
            System.out.println(pegawaiTetap.toString());
        }else if(p instanceof PegawaiHarian){
            PegawaiHarian pegawaiHarian = (PegawaiHarian) p;
            System.out.println(pegawaiHarian.toString());
        }else if (p instanceof Sales){
            Sales sales = (Sales) p;
            System.out.println(sales.toString());
        }
    }
}

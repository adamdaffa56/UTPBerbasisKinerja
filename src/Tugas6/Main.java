package com.src.Tugas6;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Manusia> ArrayManusia = new ArrayList<Manusia>();

        ArrayManusia.add(new Manusia("Aku", "3923842934", true, true));
        ArrayManusia.add(new Manusia("Dia", "1234567890", false, true));
        ArrayManusia.add(new Manusia("Dirinya", "0987654321", true, false));

        ArrayManusia.add(new MahasiswaFilkom("I Putu Yoga", "351923848239", false,false, "205150601111018",3.70));
        ArrayManusia.add(new MahasiswaFilkom("Putu Gede", "222222222222", true,false, "333333333333333",3.20));
        ArrayManusia.add(new MahasiswaFilkom("Made Kadek", "333333333333", true,false, "222222222222222",2.70));

        ArrayManusia.add(new Pekerja(7, 22,"195102439283", "Iqbal Biondy", "351717969", true,true));
        ArrayManusia.add(new Pekerja(9, 20,"331333833333", "Raiden Shogun", "123456789", false,false));
        ArrayManusia.add(new Pekerja(8, 28,"221222222222", "Muhammad Chongyun", "987654321", true,false));

        ArrayManusia.add(new Manajer(9, 20,"204837283728", "Lyra Hertin", "351707384392",false, false, 1500));
        ArrayManusia.add(new Manajer(11, 17,"111111111111", "Adam Aether", "111222333444",true, true, 1000));
        ArrayManusia.add(new Manajer(12, 23,"444444444444", "Siti Lumine", "555666777888",false, false, 700));

        for (Manusia manusia : ArrayManusia) {
            System.out.println(manusia.toString());
            System.out.println("-".repeat(55));
        }
    }
}

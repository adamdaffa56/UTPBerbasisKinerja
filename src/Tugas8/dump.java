//package com.src.Tugas8;
//
//import java.util.*;
//
//public class dump{
//    public class Main {
//        public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//
//            System.out.println("========================================");
//            System.out.println("Selamat datang di Game Filkom Defend");
//            System.out.print("Masukkan nama player : ");
//            String nama = scan.nextLine();
//            System.out.println("Silahkan pilih role anda: ");
//            System.out.println("1. Magician\n2. Healer\n3. Warrior");
//            System.out.print("Masukkan pilihan: ");
//            int pilih = 0;
//            try {
//                pilih = scan.nextInt();
//            }
//            catch(InputMismatchException e){
//                System.out.println("Masukkan pilihan yang sesuai");
//                scan.nextLine();
//                pilih = scan.nextInt();
//            }
//            scan.nextLine();
//
//            if (pilih != 1 && pilih != 2 && pilih != 3){
//                System.out.println("Masukkan pilihan yang sesuai");
//                try {
//                    pilih = scan.nextInt();
//                }
//                catch(InputMismatchException e){
//                    System.out.println("Masukkan pilihan yang sesuai");
//                    scan.nextLine();
//                    pilih = scan.nextInt();
//                }
//                scan.nextLine();
//            }
//
//            ArrayList<Character> hero = new ArrayList<>();
//
//            if (pilih == 1){
//                hero.add(new Magician());
//            }
//            else if (pilih == 2){
//                hero.add(new Healer());
//            }
//            else if (pilih == 3){
//                hero.add(new Warrior());
//            }
//
//            hero.add(new Titan());
//
//            System.out.println("Selamat datang " + nama);
//            Class role = hero.get(0).getClass();
//            System.out.println("Anda akan bermain sebagai " + role.getSimpleName());
//
//            System.out.println("=== STATUS PLAYER ===");
//            info(hero.get(0));
//            System.out.println("=== STATUS MUSUH ===");
//            info(hero.get(1));
//
//            System.out.println();
//
//            int i = 1;
//            do {
//                System.out.println("=== Turn " + i + " ===");
//                if (hero.get(0).attack()) {
//                    hero.get(1).receiveDamage(hero.get(0).getAttack());
//                }
//                i++;
//                System.out.printf("%-20s: %d%n", nama + " HP", hero.get(0).getHP());
//                System.out.printf("%-20s: %d%n", "Enemy HP", hero.get(1).getHP());
//                if (hero.get(1).getHP() == 0)
//                    break;
//
//                System.out.println("=== Turn " + i + " ===");
//                if (hero.get(0) instanceof Healer) {
//                    System.out.println("Hero mendapatkan heal!");
//                    ((Healer) hero.get(0)).heal();
//                }
//
//                if (hero.get(1).attack()) {
//                    hero.get(0).receiveDamage(hero.get(1).getAttack());
//                }
//                System.out.printf("%-20s: %d%n", nama + " HP", hero.get(0).getHP());
//                System.out.printf("%-20s: %d%n", "Enemy HP", hero.get(1).getHP());
//                i++;
//            }
//            while(hero.get(0).getHP() != 0 && hero.get(1).getHP() != 0);
//            System.out.println("----------------------------------------");
//            if (hero.get(0).getHP() == 0)
//                System.out.println(nama + " Kalah");
//            else
//                System.out.println(nama + " Menang");
//
//            System.out.println("=== STATUS PLAYER ===");
//            info(hero.get(0));
//            System.out.println("=== STATUS MUSUH ===");
//            info(hero.get(1));
//        }
//
//        static void info(Character hero){
//            Class role = hero.getClass();
//            System.out.printf("%-20s: %s%n", "Role", role.getSimpleName() );
//            hero.info();
//        }
//    }
//
//}

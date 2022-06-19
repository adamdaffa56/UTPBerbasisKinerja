package com.src.Tugas8;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean kondisi = true;
        boolean ulang = true;

        Character titan = new Titan(0, 45, 200);
        Character magician = new Magician(10, 60, 100);
        Character healer = new Healer(10, 10, 70);
        Character warrior = new Warrior(30, 25, 80);

        System.out.print("Selamat datang di game Defend FILKOM !" +
                "\nSilahkan masukkan nama player : ");
        String nama = scan.nextLine();
        System.out.println("Silahkan pilih karakter yang anda inginkan :" +
                "\n1. Magician" +
                "\n2. Healer" +
                "\n3. Warrior");

        if (ulang){
            do{

                boolean condition = true;
                int pilih = 0;
                while (condition) {
                    try{
                        pilih = scan.nextInt();
                        condition = false;
                    }catch (InputMismatchException e) {
                        System.out.println("Tolong Masukkan Angka !");
                        System.out.println("Silahkan pilih karakter yang anda inginkan : " +
                                "\n1. Magician" +
                                "\n2. Healer" +
                                "\n3. Warrior");
                    }
                    scan.nextLine();
                }

                switch (pilih){
                    case 1 ->{
                        System.out.println("Selamat datang, " + nama + " !");
                        System.out.println("-".repeat(12) + " STATUS " + "-".repeat(12));
                        info(magician);

                        int i = 0;
                        if (kondisi){
                            do{
                                System.out.println("=".repeat(12) + " TURN " + (++i) + " " + "=".repeat(12));
                                infoAttack(magician, titan, nama);

                                if (titan.getHP() == 0 || magician.getHP() == 0) {
                                    kondisi = false;
                                }
                            }while (kondisi);
                        }
                        System.out.println();
                        System.out.println("=".repeat(33));

                        gameOver(magician, titan, nama);
                        ulang = false;
                        break;
                    }
                    case 2 ->{
                        System.out.println("Selamat Datang, " + nama + " !");
                        System.out.println("-".repeat(12) + " STATUS " + "-".repeat(12));
                        info(healer);

                        int i = 0;
                        if (kondisi){
                            do{
                                System.out.println("=".repeat(12) + " TURN " + (++i) + " " + "=".repeat(12));
//                                i++;
                                if (i % 2 == 0) {
                                    System.out.println("Menggunakan skill Heal.");
                                    ((Healer) healer).heal();
                                }

                                infoAttack(healer, titan, nama);

                                if (titan.getHP() == 0 || healer.getHP() == 0) {
                                    kondisi = false;
                                }
                            }while (kondisi);
                        }
                        System.out.println();
                        System.out.println("=".repeat(33));

                        gameOver(healer, titan, nama);
                        ulang = false;
                        break;
                    }
                    case 3 ->{
                        System.out.println("Selamat Datang, " + nama + " !");
                        System.out.println("-".repeat(12) + " STATUS " + "-".repeat(12));
                        info(warrior);

                        int i = 0;
                        if (kondisi){
                            do{
                                System.out.println("=".repeat(12) + " TURN " + (++i) + " " + "=".repeat(12));
                                infoAttack(warrior, titan, nama);

                                if (titan.getHP() == 0 || warrior.getHP() == 0) {
                                    kondisi = false;
                                }
                            }while (kondisi);
                        }
                        System.out.println();
                        System.out.println("=".repeat(33));

                        gameOver(warrior, titan, nama);
                        ulang = false;
                        break;
                    }
                    default -> System.out.println("Input anda salah !" +
                            "\nSilahkan pilih karakter yang anda inginkan : " +
                            "\n1. Magician" +
                            "\n2. Healer" +
                            "\n3. Warrior");

                }
            }while (ulang);
        }
    }

    public static void infoAttack(Character player,Character enemy, String nama){
        if (player.attack() == true){
            enemy.receiveDamage(player.getAttack());
        }
        if (enemy.attack() == true){
            player.receiveDamage(enemy.getAttack());
        }

        System.out.println("Enemy's HP : "+enemy.getHP());
        System.out.println(nama+"'s HP : "+player.getHP());
    }

    public static void info(Character character){
        Class className = character.getClass();
        System.out.println("Role        : "+className.getSimpleName());
        character.info();
    }

    public static void gameOver(Character player, Character enemy, String nama){

        if (enemy.getHP() == 0) {
            System.out.println(nama+" menang");
        }else {
            System.out.println("Titan menang");
        }
        System.out.println();

        System.out.println("=".repeat(12)+" PLAYER "+"=".repeat(13));
        System.out.println("-".repeat(12)+" STATUS "+"-".repeat(13));
        info(player);
        System.out.println("=".repeat(12)+" MUSUH "+"=".repeat(14));
        System.out.println("-".repeat(12)+" STATUS "+"-".repeat(13));
        info(enemy);
    }
}

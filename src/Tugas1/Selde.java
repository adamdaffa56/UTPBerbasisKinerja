package Tugas1;

import java.util.*;

public class Selde {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int input = userInput.nextInt();
        String inputString = String.valueOf(input);

        methodBalik(inputString);
    }
    static void methodBalik(String angka){
        String balik="";
        int panjang = angka.length();

        for(int i = panjang-1; i >= 0; i--){
            balik += angka.charAt(i);
        }
        if(balik.equals(angka)){
            System.out.println(angka + " adalah selde.");
        }else{
            System.out.println(angka + " bukan selde.");
        }
    }
}

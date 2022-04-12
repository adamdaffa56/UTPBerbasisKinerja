package Tugas1;

import java.util.*;

public class SuratKaisar {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String teks = userInput.nextLine();
        int jumGeser = userInput.nextInt();

        methodGeser(teks, jumGeser);
    }

    static void methodGeser(String teks, int geser){
        String hasil = "";

        for (int i = 0; i < teks.length(); i++){
            int afterGeser = teks.charAt(i) + geser;
            if (teks.charAt(i) == ' ') {
                hasil += ' ';
            }

            if(teks.charAt(i) > 64 && teks.charAt(i) < 91){
                if (afterGeser > 90) {
                    hasil += (char)(afterGeser-26);
                }else {
                    hasil += (char)(afterGeser);
                }
            }

            else if(teks.charAt(i) > 96 && teks.charAt(i)< 123){
                if (afterGeser > 122) {
                    hasil += (char)(afterGeser-26);
                }else{
                    hasil += (char)(afterGeser);
                }
            }
        }
        System.out.println(hasil);
    }
}

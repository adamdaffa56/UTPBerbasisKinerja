package Tugas4;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        boolean kondisi = true;

        if (kondisi) {
            do{
                DataMerchant.mainMenu();
                System.out.print("Pilih Menu : ");
                int input = userInput.nextByte();
                userInput.nextLine();
                switch (input) {
                    case 1 ->DataMerchant.tampilData();
                    case 2 ->{
                        System.out.print("Tambahkan Nama Merchant : ");
                        String namaMerchant = userInput.nextLine();
                        System.out.print("Tambahkan Nama Produk   : ");
                        String namaProduk = userInput.nextLine();
                        System.out.print("Tambahkan Harga Produk  : ");
                        double Harga = userInput.nextDouble();
                        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, Harga));
                        System.out.println("-- Merchant Telah Ditambahkan!");
                    }
                    case 3 ->{
                        System.out.print("Update Merchant : ");
                        String cari = userInput.nextLine();
                        DataMerchant.updateMerchant(DataMerchant.cariMerchant(cari));
                    }
                    case 4 ->{
                        System.out.print("Cari Nama Merchant : ");
                        String cari = userInput.nextLine();
                        DataMerchant.tampilMerchant(DataMerchant.cariMerchant(cari));
                    }

                    case 5 -> {
                        System.out.println("\nTerima kasih telah menggunakan UBFood");
                        System.out.println("-------------------------------------");
                        kondisi = false;
                    }
                }
            }while (kondisi);
        }
    }
}

class Merchant{
    private String namaMerchant;
    private String namaProduk;
    private double hargaMakanan;

    Merchant(String namaMerchant, String namaProduk, double hargaMakanan){
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.hargaMakanan = hargaMakanan;

    }

    public String getNamaMerchant() {
        return namaMerchant;
    }

    public void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }
    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

}

class DataMerchant{
    static Scanner userInput = new Scanner(System.in);
    static Merchant[] merc = new Merchant[0];

    static void mainMenu(){
        System.out.println(" ");
        System.out.println("============== UBFood ==============");
        System.out.println("1. Tampilkan Merchant");
        System.out.println("2. Tambah Merchant");
        System.out.println("3. Update Merchant");
        System.out.println("4. Cari Merchant");
        System.out.println("5. Keluar");
    }

    public static void tampilData(){
        System.out.println("==== Tampilan Data Merchant UBFood ====");
        for (Merchant merchant : merc){
            System.out.println("---------------------------------------");
            System.out.println("Nama Merchant   : "+merchant.getNamaMerchant());
            System.out.println("Nama Produk     : "+merchant.getNamaProduk());
            System.out.println("Harga           : "+(int)merchant.getHargaMakanan());
        }
        System.out.println("---------------------------------------");
        System.out.println("| Nama : Adam Daffa Aryoseto Putra    |");
        System.out.println("| NIM  : 215150700111007              |");
        System.out.println("---------------------------------------");
    }

    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant[] temp = new Merchant[DataMerchant.merc.length+1];
        for (int i = 0; i < DataMerchant.merc.length; i++){
            temp[i] = DataMerchant.merc[i];
        }

        temp[temp.length - 1] = merchant;

        return temp;
    }

    public static Merchant updateMerchant(Merchant merchant){
        System.out.println("==== Pilih Update Data ====");
        System.out.println("1. Nama Merchant");
        System.out.println("2. Nama Produk");
        System.out.println("3. Harga");
        System.out.print("Pilih : ");
        int input = userInput.nextInt();
        userInput.nextLine();
        switch (input){
            case 1 ->{
                System.out.print("Nama Merchant Baru : ");
                String editNamaMerchant = userInput.nextLine();
                merchant.setNamaMerchant(editNamaMerchant);
            }
            case 2 ->{
                System.out.print("Nama Produk Baru : ");
                String editNamaProduk = userInput.nextLine();
                merchant.setNamaProduk(editNamaProduk);
            }
            case 3 ->{
                System.out.print("Harga Baru : ");
                double editHarga = userInput.nextDouble();
                merchant.setHargaMakanan(editHarga);
            }
        }
        return merchant;
    }

    public static Merchant cariMerchant(String nama){
        Merchant save = new Merchant("", "", 0);

        boolean kondisi = true;
        for (Merchant merchant : merc) {
            if (nama.equalsIgnoreCase(merchant.getNamaMerchant())) {
                save = merchant;
                kondisi = false;
            }
        }
        if (kondisi){
            System.out.println("===== Merchant Tidak Ditemukan =====");
        }

        return save;
    }

    public static void tampilMerchant(Merchant merchant){
        System.out.println("============== UBFood ==============");
        System.out.println("Nama Merchant   : "+merchant.getNamaMerchant());
        System.out.println("Nama Produk     : "+merchant.getNamaProduk());
        System.out.println("Harga           : "+(int)merchant.getHargaMakanan());
    }


}



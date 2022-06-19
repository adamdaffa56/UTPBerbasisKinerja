package com.src.Tugas6;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji(){
        gaji = this.getHariKerja() * this.getJamKerja() * 15;
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus(){
        int minggu = 0;
        int libur = 0;

        int i = 1;
        while (i <= getHariKerja()) {
            if((i - minggu) % 6 == 0){
                libur++;
            }
            if(i % 7 == 0){
                libur++;
                minggu++;
            }
            i++;
        }

        double lamaLembur;
        if ((getJamKerja() - 7) <= 0) {
            lamaLembur = 0;
        }else{
            lamaLembur = getJamKerja() - 7;
        }

        double bonusLembur = (getHariKerja()-libur) * lamaLembur * 7;

        double bonusLibur = libur * getJamKerja() * 20;

        bonus = bonusLembur + bonusLibur;
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus(){
        String kantorCabang = "";
        String nKantorCabang = Character.toString(getNIP().charAt(2));

        String Departemen = "";

        switch (getNIP().charAt(0)) {
            case '1' -> kantorCabang = "Mondstadt";
            case '2' -> kantorCabang = "Liyue";
            case '3' -> kantorCabang = "Inazuma";
            case '4' -> kantorCabang = "Sumeru";
            case '5' -> kantorCabang = "Fontaine";
            case '6' -> kantorCabang = "Natlan";
            case '7' -> kantorCabang = "Snezhnaya";
        }

        switch (getNIP().charAt(6)) {
            case '1' -> Departemen = "Pemasaran";
            case '2' -> Departemen = "Humas";
            case '3' -> Departemen = "Riset";
            case '4' -> Departemen = "Teknologi";
            case '5' -> Departemen = "Personalia";
            case '6' -> Departemen = "Akademik";
            case '7' -> Departemen = "Administrasi";
            case '8' -> Departemen = "Operasional";
            case '9' -> Departemen = "Pembangunan";
        }
        return Departemen+", "+kantorCabang+" Cabang "+nKantorCabang;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + this.getGaji() + this.getBonus();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nGaji               : "+"$"+this.getGaji()+
                "\nBonus              : "+"$"+this.getBonus()+
                "\nDepartemen, Cabang : "+this.getStatus();
    }
}

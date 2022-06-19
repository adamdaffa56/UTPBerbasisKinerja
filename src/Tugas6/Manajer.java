package com.src.Tugas6;

public class Manajer extends Pekerja{
    private int lamaKerja;


    Manajer( int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah,int lamaKerja){
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + 15;
    }

    @Override
    public double getBonus() {
        return super.getBonus() + (super.getBonus() * 0.3);
    }

    @Override
    public double getPendapatan() {
        return this.getTunjangan() + this.getBonus() + super.getGaji();
    }

    @Override
    public String toString() {
        return super.toString() + "\nLama Kerja         : "+this.getLamaKerja() + " hari";
    }
}

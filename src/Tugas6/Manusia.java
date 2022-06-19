package com.src.Tugas6;

public class Manusia{
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;

    Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getJenisKelamin(){
        return this.isJenisKelamin() ? "Laki-Laki":"Perempuan";
    }

    public double getTunjangan(){
        double tunjangan = 0;
        if (isMenikah() == true){
            if (isJenisKelamin() == true){
                tunjangan = 25;
            }else{
                tunjangan = 20;
            }
        }else{
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString(){
        return  "Nama               : "+this.getNama()+
                "\nNIK                : "+this.getNIK()+
                "\nJenis Kelamin      : "+this.getJenisKelamin()+
                "\nPendapatan         : "+"$"+this.getPendapatan();
    }
}

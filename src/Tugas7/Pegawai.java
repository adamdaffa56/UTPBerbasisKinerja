package com.src.Tugas7;

public abstract class Pegawai{
    private String nama;
    private String noKTP;

    Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String toString(){
        return  "Nama            : "+this.getNama()+
                "\nNo KTP         : "+this.getNoKTP();
    }

    public String getFormattedPrice(Double format){
        return String.format("Rp. %.0f", format);
    }

    public abstract double gaji();
}

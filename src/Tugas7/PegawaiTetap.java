package com.src.Tugas7;

public class PegawaiTetap extends Pegawai{
    private double upah;

    PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public String toString(){
        return "Pegawai Tetap   : "+super.getNama()+
                "\nNo KTP          : "+super.getNoKTP()+
                "\nUpah            : "+this.getUpah()+
                "\nPendapatan      : "+super.getFormattedPrice(this.gaji());
    }

    @Override
    public double gaji(){
        return getUpah();
    }
}

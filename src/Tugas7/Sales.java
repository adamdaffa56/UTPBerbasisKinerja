package com.src.Tugas7;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public String toString(){
        return "Sales           : "+super.getNama()+
                "\nNo KTP          : "+super.getNoKTP()+
                "\nTotal Penjualan : "+getPenjualan()+
                "\nBesaran Komisi  : "+getKomisi()+
                "\nPendapatan      : "+super.getFormattedPrice(this.gaji());
    }

    @Override
    public double gaji(){
        return getPenjualan() * getKomisi();
    }
}

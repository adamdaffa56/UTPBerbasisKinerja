package com.src.Tugas7;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public String toString(){
        return "Pegawai Harian  : "+super.getNama()+
                "\nNo KTP          : "+super.getNoKTP()+
                "\nUpah/Jam        : "+this.getUpahPerJam()+
                "\nTotal jam kerja : "+this.getTotalJam()+
                "\nPendapatan      : "+super.getFormattedPrice(this.gaji());
    }

    @Override
    public double gaji(){
        double gajiAkhir = 0;
        if (getTotalJam() <= 40){
            gajiAkhir = getUpahPerJam() * getTotalJam();
        }else{
            gajiAkhir = (40 * getUpahPerJam()) + ((getTotalJam()-40) * getUpahPerJam() * 1.5);
        }
        return gajiAkhir;
    }
}

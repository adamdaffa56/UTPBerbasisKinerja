package com.src.Tugas6;

public class MahasiswaFilkom extends Manusia{
    private String NIM;
    private double IPK;

    MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK){
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){
        String angkatan = "20"+getNIM().substring(0,2);

        String prodi = switch (getNIM().charAt(6)){
            case '2' -> "Teknik Meniup Gelembung";
            case '3' -> "Teknik Berburu Ubur Ubur";
            case '4' -> "Sistem Perhamburgeran";
            case '6' -> "Pendidikan Chum Bucket";
            case '7' -> "Teknologi Telepon Kerang";
            default -> "";
        };
        return prodi+", "+angkatan;
    }

    public double getBeasiswa(){
        double beasiswa = 0;

        if (getIPK() >= 3.0 && getIPK() <= 3.5) {
            beasiswa = 50;
        }else if (getIPK() > 3.5 && getIPK() <= 4) {
            beasiswa = 75;
        }
        return beasiswa;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + this.getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nNIM                : "+this.getNIM()+
                "\nIPK                : "+this.getIPK()+
                "\nProdi, Angkatan    : "+this.getStatus();
    }
}

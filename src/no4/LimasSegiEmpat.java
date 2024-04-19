package no4;

/**
 * Danis Keysara Saputra (2207275)
 * Pilkom A
 */

public class LimasSegiEmpat {

    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    //Constructor tanpa parameter
    public LimasSegiEmpat() {
        this(0, 0, 0);
    }

    //Constructor dengan parameter
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }

    //Getter untuk luas alas
    public double getLuasAlas() {
        return luasAlas;
    }

    //Setter untuk luas alas
    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    //Getter untuk luas selubung limas
    public double getLuasSelubungLimas() {
        return luasSelubungLimas;
    }

    //Setter untuk luas selubung limas
    public void setLuasSelubungLimas(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    //Getter untuk tinggi
    public double getTinggi() {
        return tinggi;
    }

    //Setter untuk tinggi
    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    //Menghitung luas limas segi empat
    public double hitungLuas() {
        return luasAlas + luasSelubungLimas;
    }

    //Menghitung volume limas segi empat
    public double hitungVolume() {
        return (1.0 / 3) * luasAlas * tinggi;
    }

    //Menampilkan informasi limas segi empat
    public void cetak() {
        System.out.println("Limas segi empat dengan luas alas: " + getLuasAlas() + ", luas selubung limas: " + getLuasSelubungLimas() + ", dan tinggi: " + getTinggi() + ".");
        System.out.println("Luasnya: " + String.format("%.2f", hitungLuas()) + ", sedangkan volumenya: " + String.format("%.2f", hitungVolume()));
    }
}

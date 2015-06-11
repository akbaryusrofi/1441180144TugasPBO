package com.akbar;

/**
 * Created by Akbar on 6/11/2015.
 */
public class hape {
    private String merkHp;
    private int harhaHp;
    private String asalPembuatan;
    private int kapasitasMemori;
    private batrai jenisBatrai;


    public hape(String merkHp, int harhaHp, String asalPembuatan, int kapasitasMemori, batrai jenisBatrai) {
        this.merkHp = merkHp;
        this.harhaHp = harhaHp;
        this.asalPembuatan = asalPembuatan;
        this.kapasitasMemori = kapasitasMemori;
        this.jenisBatrai = jenisBatrai;
    }

    public String getMerkHp() {
        return merkHp;
    }

    public void setMerkHp(String merkHp) {
        this.merkHp = merkHp;
    }

    public int getHarhaHp() {
        return harhaHp;
    }

    public void setHarhaHp(int harhaHp) {
        this.harhaHp = harhaHp;
    }

    public String getAsalPembuatan() {
        return asalPembuatan;
    }

    public void setAsalPembuatan(String asalPembuatan) {
        this.asalPembuatan = asalPembuatan;
    }

    public int getKapasitasMemori() {
        return kapasitasMemori;
    }

    public void setKapasitasMemori(int kapasitasMemori) {
        this.kapasitasMemori = kapasitasMemori;
    }

    public batrai getJenisBatrai() {
        return jenisBatrai;
    }

    public void setJenisBatrai(batrai jenisBatrai) {
        this.jenisBatrai = jenisBatrai;
    }

    @Override
    public String toString() {
        return "hape{" +
                "merkHp='" + merkHp + '\'' +
                ", harhaHp=" + harhaHp +
                ", asalPembuatan='" + asalPembuatan + '\'' +
                ", kapasitasMemori=" + kapasitasMemori +
                ", jenisBatrai=" + jenisBatrai +
                '}';
    }
}

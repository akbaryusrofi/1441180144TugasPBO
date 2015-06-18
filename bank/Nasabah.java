package com.akbar;

/**
 * Created by Akbar on 6/17/2015.
 */
public class Nasabah {

    private String Nama;
    private int Rek;
    private Account Rekening;

    public Nasabah(String nama, int rek) {
        Nama = nama;
        Rek = rek;
    }

    public Nasabah(String nama, int rek, Account rekening) {
        Nama = nama;
        Rek = rek;
        Rekening = rekening;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public int getRek() {
        return Rek;
    }

    public void setRek(int rek) {
        Rek = rek;
    }

    public Account getRekening() {
        return Rekening;
    }

    public void setRekening(Account rekening) {
        Rekening = rekening;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "Nama='" + Nama + '\'' +
                ", Rek=" + Rek +
                ", Rekening=" + Rekening +
                '}';
    }
}

package bola;

import java.util.ArrayList;

/**
 * Created by Akbar on 6/24/2015.
 */
public class Devisi {
    private String namaDevisi;
    private Liga liga;
    ArrayList<Club> daftarClub = new ArrayList<Club>();
    ArrayList<Club> namaClub = new ArrayList<Club>();


    public Devisi(String namaDevisi) {
        this.namaDevisi = namaDevisi;
    }

    public String getNamaDevisi() {
        return namaDevisi;
    }

    public void setNamaDevisi(String namaDevisi) {
        this.namaDevisi = namaDevisi;
    }

    public ArrayList<Club> getDaftarClub(Devisi serieA) {
        System.out.println("Daftar Club: ");
        return daftarClub;
    }

    public void setDaftarClub(Club club) {
        this.daftarClub.add(club);
    }

    public ArrayList<Club> getNamaClub() {
        return namaClub;
    }

    public void setNamaClub(Club namaClub) {
        this.namaClub.add(namaClub);
    }

    public  void  getDaftarClub(String ligaCari){

//

        }

    @Override
    public String toString() {
        return "Divisi{" +
                "namaDivisi='" + namaDevisi + '\'' +
                '}';

    }

    public ArrayList<Club> getDaftarClub() {
        return daftarClub;
    }
}

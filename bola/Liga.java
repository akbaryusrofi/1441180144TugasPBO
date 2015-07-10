package bola;

import java.util.ArrayList;

/**
 * Created by Akbar on 6/24/2015.
 */
public class Liga extends testBola{
    private String namaLiga;
    private  Club daftarClub;

    ArrayList<Devisi> daftarDevisi = new ArrayList<Devisi>();
    ArrayList<Devisi> namaDevisi = new ArrayList<Devisi>();




    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public Liga(String namaLiga, Club daftarClub) {
        this.namaLiga = namaLiga;
        this.daftarClub = daftarClub;
        System.out.println(this.daftarClub);
    }



    public String getNamaLiga() {
        System.out.println("Nama Liga");
        return namaLiga;
    }

    public ArrayList<Devisi> getNamaDevisi() {
        return namaDevisi;
    }

    public void setNamaDevisi(Devisi namaDevisi ) {
        this.namaDevisi.add(namaDevisi);
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public ArrayList<Devisi> getDaftarDevisi() {
        System.out.println("Daftar Devisi");
        return daftarDevisi;
    }

    public void setDaftarDevisi(Devisi devisi) {
        this.daftarDevisi.add(devisi);
    }

    public void getDaftarClub() {
        for (int x=0 ; x < daftarDevisi.size() ; x++) {
            Devisi devisi = daftarDevisi.get(x);
            System.out.println(devisi.getDaftarClub());
        }

    }



    public void setDaftarClub(Club daftarClub) {
        // seting tidak berhasil
         System.out.println(daftarClub.getNamaClub());
         this.daftarClub = daftarClub;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                '}';
    }
}

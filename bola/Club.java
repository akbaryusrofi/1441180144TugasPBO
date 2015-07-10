package bola;

import java.util.ArrayList;

/**
 * Created by Akbar on 7/2/2015.
 */
public class Club extends testBola{
    private String namaClub;
    private Devisi devisi;
    private Liga liga;

    public Club(String namaClub) {
        this.namaClub = namaClub;
    }
    ArrayList<Liga> namaliga = new ArrayList<Liga>();

    public Club(String namaClub, Devisi devisi, Liga liga) {
        this.namaClub = namaClub;
        this.devisi = devisi;
        this.liga = liga;
    }

    public String getNamaClub() {
        return namaClub;
    }

    public void setNamaClub(String namaClub) {
        this.namaClub = namaClub;
    }

    public Devisi getDevisi() {
        return devisi;
    }

    public void setDevisi(Devisi devisi) {
        this.devisi = devisi;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Devisi serieA) {
        this.liga = liga;
    }

    public void getNamaLiga() {
        for (int g=0; g<liga.daftarDevisi.size();g++){
            Liga x = namaliga.get(g);
        }

    }
    @Override
    public String toString() {
        return "Club{" +
                "namaClub='" + namaClub + '\'' +
                '}';


    }


}

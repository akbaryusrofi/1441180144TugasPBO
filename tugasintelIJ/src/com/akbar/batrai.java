package com.akbar;

public class batrai {
    private String jenisBatrai;
    private int voltageBatrai;
    private int ampereBatrai;

    public batrai(String jenisBatrai, int voltageBatrai, int ampereBatrai) {
        this.jenisBatrai = jenisBatrai;
        this.voltageBatrai = voltageBatrai;
        this.ampereBatrai = ampereBatrai;
    }

    public String getJenisBatrai() {
        return jenisBatrai;
    }

    public void setJenisBatrai(String jenisBatrai) {
        this.jenisBatrai = jenisBatrai;
    }

    public int getVoltageBatrai() {
        return voltageBatrai;
    }

    public void setVoltageBatrai(int voltageBatrai) {
        this.voltageBatrai = voltageBatrai;
    }

    public int getAmpereBatrai() {
        return ampereBatrai;
    }

    public void setAmpereBatrai(int ampereBatrai) {
        this.ampereBatrai = ampereBatrai;
    }

    @Override
    public String toString() {
        return "batrai{" +
                "jenisBatrai=" + jenisBatrai +
                ", voltageBatrai=" + voltageBatrai +
                ", ampereBatrai=" + ampereBatrai +
                '}';
    }
}

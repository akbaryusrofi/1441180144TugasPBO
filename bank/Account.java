package com.akbar;

/**
 * Created by Akbar on 6/17/2015.
 */
public class Account {
    private double saldo;

    public Account(double saldo) {
        this.saldo = saldo;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public void tarik(double tarik){
        this.saldo = saldo - tarik;

    }

    public void setor(double setor){
        this.saldo = saldo + setor;
    }

    @Override
    public String toString() {
        return "Account{" +
                "saldo=" + saldo +
                '}';
    }
}

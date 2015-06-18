package com.akbar;

/**
 * Created by Akbar on 6/17/2015.
 */
public class TestUnit {
    public static void main(String[] args) {

        Account aa= new Account(300000.0);
        Nasabah bb = new Nasabah("Akbar",111);


        System.out.println(bb.toString());
        bb.setRekening(aa);
        System.out.println(bb.toString());

//tarik menarik uang--------------------
        System.out.println("yang anda tarik 50000");
        aa.tarik(50000.0);
        System.out.println("Saldo Akir" + aa.getSaldo());



// setor menyetor uang--------------------
        System.out.println("yang anda setor 400000");
        aa.setor(400000.0);
        System.out.println("saldo Akir "+ aa.getSaldo());







    }
}

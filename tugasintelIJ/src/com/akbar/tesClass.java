package com.akbar;

/**
 * Created by Akbar on 6/11/2015.
 */
public class tesClass {
public static void main(String [] Args){

    batrai litium = new batrai("litium",5000,4);
    batrai ion = new batrai("ion",3000,4);
    batrai abc = new batrai("abc", 1300,2);

    hape samsung = new hape("Samsung",4000000,"Kanada",1,litium);
    hape andromax = new hape("andromax",1000000,"indonesia,",1,abc);
    System.out.println(samsung.toString());
    System.out.println(andromax.getJenisBatrai().getJenisBatrai());


}

}

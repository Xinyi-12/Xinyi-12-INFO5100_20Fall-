package edu.neu.info5100.assignment05;

public class DessertShoppe {
    public final static double TAX_RATE = 0.065;
    public final static int MAX_SIZE_NAME_SIZE = 30;
    public final static int MAX_WIDTH = 20;
    public final static String SHOP_NAME = "M & M Dessert Shoppe";

    //private String name;

    public DessertShoppe() {
    }

    public static String cents2dollarsAndCents(int cents){
        String dollars  = (cents * 0.01) + "";

        return dollars;
    }
}



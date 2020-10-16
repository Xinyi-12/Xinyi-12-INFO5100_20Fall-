package edu.neu.info5100.assignment05;

import java.util.*;


public class Checkout extends java.lang.Object {

    List<DessertItem> dessertItemList = new Vector<DessertItem>();

    public void checkOut(){
        this.dessertItemList = new Vector<DessertItem>();

    }

    public void enterItem(DessertItem item){

        dessertItemList.add(item);
    }

    public int numberOfItems(){

        int size = dessertItemList.size();
        return size;
    }

    public int totalCost(){
        //before tex
        int sumCost = 0;
        for (int i = 0 ; i < dessertItemList.size() ; i++){
             sumCost = sumCost + dessertItemList.get(i).getCost();
        }

        return sumCost;
    }

    public void clear(){
        dessertItemList.clear();
    }

    public int totalTax(){

        Checkout checkout = new Checkout();

        int totalTax = (int) Math.round(totalCost() * DessertShoppe.TAX_RATE);

        return totalTax;
    }

    @Override
    public java.lang.String toString() {

        String s = "";
        String shopName = DessertShoppe.SHOP_NAME;

        System.out.println(shopName);
        System.out.println("-------------------");

        //item's name and prices
        for(int i = 0 ; i < dessertItemList.size(); i++){

            if (dessertItemList.get(i) instanceof Candy){
                double candyWeight = ((Candy) dessertItemList.get(i)).getWeight();
                String candyPricePerLB = DessertShoppe.cents2dollarsAndCents(((Candy) dessertItemList.get(i)).getPricePerLB());
                String sCandy = candyWeight + "lbs. @ " + candyPricePerLB + " /lb.";
                System.out.println(sCandy);


            }else if (dessertItemList.get(i) instanceof Cookie ){
                int cookieNumber = ((Cookie) dessertItemList.get(i)).getNumber();
                String cookiePricePerDz =  DessertShoppe.cents2dollarsAndCents(((Cookie) dessertItemList.get(i)).getPricePerDz());
                String sCookie = cookieNumber + " @ " + cookiePricePerDz + " /dz.";
                System.out.println(sCookie);

            }else if (dessertItemList.get(i) instanceof Sundae){
                String sundeaName = ((Sundae) dessertItemList.get(i)).getSundeaName();
                String icecreamName = dessertItemList.get(i).getName();
                String cSundae = DessertShoppe.cents2dollarsAndCents(((Sundae) dessertItemList.get(i)).getCost());

                System.out.println(sundeaName + " with" );
            }

            String icecreamname =  dessertItemList.get(i).getName();
            String sIceCream = DessertShoppe.cents2dollarsAndCents(dessertItemList.get(i).getCost());
            System.out.println(icecreamname +"  " + sIceCream);

        }

        // tax
        System.out.println("Tax  " + totalTax());

        //total cost
        System.out.println("Total cost " + DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax()));


        return s;
    }
}
//print out :
//
//        Number of items: 4
//
//
//        Total cost: 1331

//
//        Total tax: 87
//
//
//        Cost + Tax: 1418
//
//        M & M Dessert Shoppe
//        -------------------
//        2.25lbs. @ 3.99 /lb.
//        Peanut Butter Fudge  8.98
//        Vanilla Ice Cream  1.05
//        HotFudge with
//        Choc. Chip Ice Cream  1.95
//        4 @ 3.99 /dz.
//        Oatmeal Raisin Cookies  1.33
//        Tax  87
//        Total cost 14.18
//
//
//        Number of items: 6
//
//
//        Total cost: 1192
//
//
//        Total tax: 77
//
//
//        Cost + Tax: 1269
//
//        M & M Dessert Shoppe
//        -------------------
//        Strawberry Ice Cream  1.45
//        Caramel with
//        Vanilla Ice Cream  1.55
//        1.33lbs. @ 0.89 /lb.
//        Gummy Worms  1.18
//        4 @ 3.99 /dz.
//        Chocolate Chip Cookies  1.33
//        1.5lbs. @ 2.09 /lb.
//        Salt Water Taffy  3.14
//        3.0lbs. @ 1.09 /lb.
//        Candy Corn  3.27
//        Tax  77
//        Total cost 12.69
//
//
//        Process finished with exit code 0

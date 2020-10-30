package edu.neu.info5100.assignment06;

import java.util.ArrayList;
import java.util.Arrays;



public class TestMreview {
    public static void main(String[] args) {
        //test first movie
        ArrayList<Integer> mRate01 = new ArrayList<Integer>(Arrays.asList(
                4,4,5
        ));
        Mreview mreview01 = new Mreview("Die Welle", mRate01);
        System.out.println(mreview01);

        //test second movie
        ArrayList<Integer> mRate02 = new ArrayList<Integer>(Arrays.asList(
                3,5,5,4,5
        ));
        Mreview mreview02 = new Mreview("Joker", mRate02);
        System.out.println(mreview02);

    }
}

//print out
//Die Welle, average 4.33 out of 3 ratings
//Joker, average 4.4 out of 5 ratings

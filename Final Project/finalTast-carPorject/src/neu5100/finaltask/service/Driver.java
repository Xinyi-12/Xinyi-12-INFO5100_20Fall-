package neu5100.finaltask.service;

import java.util.ArrayList;

public class Driver {

    //test carDataReader() method
    public static void main(String[] args) {

        //example 1: create a List to store the carInfo of gmps-aj-dohmann dealer
        ArrayList<CarItem> ajDohmannList = new ArrayList<>();
        CarReader carReader = new CarReader();
        carReader.carDataReader(ajDohmannList ,"gmps-aj-dohmann");

        //show data of the ajDohmannList
        for (CarItem item:ajDohmannList) {
            System.out.println(item);
        }

    }

}

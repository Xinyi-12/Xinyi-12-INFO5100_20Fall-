package edu.neu.info5100.assignment06;

public class testPet {
    public static void main(String[] args) {
        Pet cat01 = new Cat("tom","Bob","black","short");
        cat01.setSex(Pet.MALE);
        System.out.println(cat01);
        ((Cat) cat01).setBoardStart(1,31,2020);
        ((Cat) cat01).setBoardEnd(2,28,2020);
        System.out.println(((Cat) cat01).boarding(1,31,2020));
        System.out.println("=================");
        //test boarding() method:
        System.out.println(((Cat) cat01).boarding(1,30,2020));
        System.out.println(((Cat) cat01).boarding(2,28,2020));
        System.out.println(((Cat) cat01).boarding(3,1,2020));

        System.out.println("======================================");
        Pet dog01 = new Dog("Spot","Susan","white","medium");
        dog01.setSex(Pet.SPAYED);
        System.out.println(dog01);
        ((Dog) dog01).setBoardStart(3,20,2020);
        ((Dog) dog01).setBoardEnd(4,20,2020);
        System.out.println(((Dog) dog01).boarding(4,2,2020));

    }

}

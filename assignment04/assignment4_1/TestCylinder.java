package edu.neu.info5100.assignment04;

public class TestCylinder {
    public static void main(String[] args) {

        //Constructed a Circle with Circle()
        Circle circle = new Circle();
        circle.setRaduis(2.0);
        circle.setColor("yellow");
        //Run of the program should produce the following output:
        //Radius is 2.0, Color is yellow, Base area is (your answer)
        System.out.println("Raduis is " + circle.getRaduis() + ", Color is " + circle.getColor() +
                ", Base area is " + circle.getArea(2,"yellow"));

        //Constructed a Cylinder with Cylinder()
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(1.0);
        cylinder.setRaduis(1.0);
        cylinder.setColor("red");
        //Run of the program should produce the following output:
        //Radius is 1.0, Height is 1.0, Color is red, Base area is (your answer), Volume is (your answer)
        System.out.println("Raduis is " + cylinder.getRaduis() + ", Height is " + cylinder.getHeight()  +
                ", Color is " + cylinder.getColor() + ", Base area is " + circle.getArea(1.0,"red") +
                ", Volume is " + cylinder.getVolume(1.0,1.0,"red"));


        //Constructed a Cylinder with Cylinder(height, radius)
        Cylinder cylinder02 = new Cylinder(2.0,5.0);
        //Run of the program should produce the following output:
        //Radius is 2.0, Height is 5.0, Color is red, Base area is (your answer), Volume is (your answer)
        System.out.println("Raduis is " + cylinder02.getRaduis() + ", Height is " + cylinder02.getHeight()  +
                " , Color is " + cylinder02.getColor() + ", Base area is " + circle.getArea(2.0,"red") +
                ", Volume is " + cylinder02.getVolume(5.0,2.0,"red"));
    }

}
//print out:
//Raduis is 2.0, Color is yellow, Base area is 12.56
//Raduis is 1.0, Height is 1.0, Color is red, Base area is 3.14, Volume is 3.14
//Raduis is 2.0, Height is 5.0 , Color is red, Base area is 12.56, Volume is 62.800000000000004
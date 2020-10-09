package edu.neu.info5100.assignment04;

public class Cylinder extends Circle{

    private final static double PAI = 3.14;

    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double raduis, double height) {
        super(raduis);
        this.height = height;
    }


    public Cylinder(double raduis, String color, double height) {
        super(raduis, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

        public void setHeight(double height) {
        this.height = height;
    }



    public double getVolume(double h , double r, String color ){

        Circle circle = new Circle();
        double area = circle.getArea(r,color);

        double volume = PAI * r * r * h * 2;

        return volume;
    }

    // Override the getArea() method inherited from superclass Circle

    @Override
    public double getArea(double r, String color) {
        return super.getArea(r, color);
    }
}


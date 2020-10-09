package edu.neu.info5100.assignment04;

public class Circle {

    private final static double PAI = 3.1;

    private double raduis = 1.0;

    private String color = "red";

    public Circle() {
    }

    public Circle(double raduis) {
        this.raduis = raduis;
    }


    public Circle(double raduis, String color) {
        this.raduis = raduis;
        this.color = color;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(double r,String color){
        double area = PAI * r * r;

        return area;
    }

}

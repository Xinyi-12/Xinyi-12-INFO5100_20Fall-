package edu.neu.info5100.assignment05;

public class Candy extends DessertItem {

    private double weight;

    private int pricePerLB;

    public Candy() {
    }

    public Candy(String candyName, double weight, int pricePerLB) {
        super(candyName);
        this.weight = weight;
        this.pricePerLB = pricePerLB;
    }

    @Override
    public int getCost() {
        int cost = (int) Math.round(weight * pricePerLB);
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public int getPricePerLB() {
        return pricePerLB;
    }


}

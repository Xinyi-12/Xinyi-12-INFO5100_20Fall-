package edu.neu.info5100.assignment05;

public class Cookie extends DessertItem{
    private int number;

    private int pricePerDz;

    public Cookie() {
    }

    public Cookie(String name, int number, int pricePerDz) {
        super(name);
        this.number = number;
        this.pricePerDz = pricePerDz;
    }

    @Override
    int getCost() {
        int cost = (int) Math.round(number * (((pricePerDz * 100) / 12 )*0.01));

        return cost;
    }

    public int getNumber() {
        return number;
    }

    public int getPricePerDz() {
        return pricePerDz;
    }
}

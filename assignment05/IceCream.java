package edu.neu.info5100.assignment05;

public class IceCream extends DessertItem {

    private int icecreamCost;

    public IceCream() {
    }

    public IceCream(String icecreamName, int icecreamCost) {
        super(icecreamName);
        this.icecreamCost = icecreamCost;
    }

    @Override
    int getCost() {
        return icecreamCost;
    }


}

package edu.neu.info5100.assignment05;

public class Sundae extends IceCream {

    private String sundeaName;
    private int costTopping;

    public Sundae(String icecreamName, int icecreamCost, String sundeaName, int costTopping) {
        super(icecreamName, icecreamCost);
        this.sundeaName = sundeaName;
        this.costTopping = costTopping;
    }

    @Override
    int getCost() {
        return super.getCost() + costTopping;
    }

    public String getSundeaName() {
        return sundeaName;
    }

    public int getCostTopping() {
        return costTopping;
    }
}

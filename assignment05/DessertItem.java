package edu.neu.info5100.assignment05;

public abstract class DessertItem {

    protected String name;

    public DessertItem(String name) {
        if (name.length() <= DessertShoppe.MAX_SIZE_NAME_SIZE){
            this.name = name;
        }else {

            this.name.substring(0,DessertShoppe.MAX_SIZE_NAME_SIZE);
        }
    }

    public DessertItem() {
    }

    public final java.lang.String getName() {
        return name;
    }

    int getCost() {
        return 0;
    }


}

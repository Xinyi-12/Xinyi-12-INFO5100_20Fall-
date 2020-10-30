package edu.neu.info5100.assignment06;

import java.util.Date;

public class Dog extends Pet implements Boardable{

    private String size;
    private Date boardStart;
    private Date boardEnd;

    public Dog(String petName, String ownerName, String color, String size) {
        super(petName, ownerName, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return  Dog.class.getSimpleName().toUpperCase() + ": " + '\n' +
                getPetName() + "owned by " + getOwnerName() + '\n'+
                "Color: " + getColor() + '\n' +
                "Sex: " + getSex() + '\n' +
                "Hair: " + getSize();
    }

    @Override
    public void setBoardStart(int month, int day, int year) {

        boardStart = new Date(year,month,day);
        //this.boardStart = boardStart;
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {

        boardEnd = new Date(year,month,day);
    }

    @Override
    public boolean boarding(int month, int day, int year) {

        Date boardDate = new Date(year,month,day);
        //setBoardStart();

        if (boardDate.after(boardStart) && boardDate.before(boardEnd) ){
            return true;
        }
        if (boardDate.equals(boardStart) || boardDate.equals(boardEnd)){
            return true;
        }
        return false;
    }
}

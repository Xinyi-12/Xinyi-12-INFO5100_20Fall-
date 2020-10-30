package edu.neu.info5100.assignment06;

import java.util.Date;

public class Cat extends Pet implements Boardable{

    private String hairLength;
    private Date boardStart;
    private Date boardEnd;

    public Cat(String petName, String ownerName, String color, String hairLength) {
        super(petName, ownerName, color);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
    }

    @Override
    public String toString() {
        return  Cat.class.getSimpleName().toUpperCase() + ": " + '\n' +
                getPetName() + "owned by " + getOwnerName() + '\n'+
                "Color: " + getColor() + '\n' +
                "Sex: " + getSex() + '\n' +
                "Hair: " + getHairLength();
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

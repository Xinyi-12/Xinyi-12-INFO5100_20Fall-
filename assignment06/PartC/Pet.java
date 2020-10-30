package edu.neu.info5100.assignment06;

public class Pet {


    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int SPAYED = 3;
    public static final int NEUTERED = 4;

    private String petName;

    private String ownerName;

    private String color;

    protected Integer sex;

    public Pet(String petName, String ownerName, String color) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public void  setSex(int sexcode) {
        this.sex=sexcode;

    }
    public String getSex(){
        if (this.sex == MALE){
            return "Male";
        }else if (this.sex == FEMALE){
            return "Famele";
        }else if (this.sex == SPAYED){
            return "Spayed";
        }else if(this.sex == NEUTERED){
            return "Neutered";
        }
        return null;
    }



    @Override
    public String toString() {
        return  petName + "owned by " + ownerName + '\''+
                "Color:" + color + '\'' +
                "Sex:" + getSex();
    }
}

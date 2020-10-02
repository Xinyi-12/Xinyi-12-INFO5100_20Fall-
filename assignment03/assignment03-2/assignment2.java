package edu.neu.info5100.assignment03.assignment3_2;

public class assignment2 {

    private static final String Blank = " ";

    public static void main(String[] args) {

        String s = "the SkY is blue ";
        assignment2 a = new assignment2();
        a.reverse(s);

    }
    public String reverse(String s){

        if (s == null){
            return s;
        }

        String[] token = s.split(Blank);

        for (int j = token.length-1 ; j >= 0 ; j--){
            System.out.print(token[j].toLowerCase() + " ");
        }
        return s;
    }
}

//print out
//blue is sky the

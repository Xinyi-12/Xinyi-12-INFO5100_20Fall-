package edu.neu.info5100.assignment03.assignment03;

public class Test03 {

    public static void main(String[] args) {
        Professor professor = new Professor.Builder("chen","yilin")
                .id(1001).build();
        System.out.println(professor);
    }
}

//print out
//Professor{firstName='chen', lastName='yilin', id=1001}

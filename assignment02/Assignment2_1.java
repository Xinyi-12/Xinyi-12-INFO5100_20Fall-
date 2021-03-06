package edu.neu.info5100.Assignment;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
        //write your code here
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }


    // Getter for `name`. Return the current `name` data
    public String getName() {
        //write your code here
        return name;
    }


    // Setter for `name`. Set `name` data
    public void setName(String name) {
        //write your code here
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    public void raiseSalary(double byPercent){

        Employee.this.salary = byPercent * Employee.this.salary;
        System.out.println(Employee.this.salary);

    }
}

enum Gender {
    MALE,
    FEMALE;
}

public class Assignment2_1 {
    // Assignment
    private final static double Tax = 0.062;

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        //write your code here
        double securityTax = 0;
        if(employee.salary <= 8900){
            securityTax = employee.salary * Tax;

        }else {
            securityTax = 106800 * Tax;
        }
        return securityTax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    private static final double RANK01 = 0.03;
    private static final double RANK02 = 0.04;
    private static final double RANK03 = 0.05;
    private static final double RANK04 = 0.06;
    public double insuranceCoverage(Employee employee) {
        //write your code here
        int eage = employee.age;
        double eSalary = employee.salary;
        double insuranceCoveragefee = 0;
        if (eage < 35){
            insuranceCoveragefee = eSalary * RANK01;
        }else if(eage >= 35 || employee.age <= 50){
            insuranceCoveragefee = eSalary * RANK02;
        }else if (eage > 50 || employee.age < 60){
            insuranceCoveragefee = eSalary * RANK03;
        }else if (eage > 60){
            insuranceCoveragefee = eSalary * RANK04;

        }
        return insuranceCoveragefee;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here

        List<Employee> employees = new ArrayList<>(Arrays.asList(e1,e2,e3));

        employees.sort(Comparator.comparing(Employee::getSalary));
        for (Employee employee: employees) {
            System.out.println(employee.name);
        }

    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
        //write your code here
        double byPecent = 3.0;
       employee.raiseSalary(byPecent);
        //Double newSalary = employee.salary * 3;

    }

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
    */
    public static void main(String[] args) {


        //test sortSalary method
        Employee e1 = new Employee("Alice",23,Gender.FEMALE,1000.00);
        Employee e2 = new Employee("John",24,Gender.MALE,500.00);
        Employee e3 = new Employee("Jenny",40,Gender.FEMALE,1200.00);
        Assignment2_1 ass = new Assignment2_1();
        ass.sortSalary(e1,e2,e3);
        //test tripleSalary method
        ass.tripleSalary(e1);
        //test insuranceCoverage method
        System.out.println("Jenny's insuranceCoverage : " + ass.socialSecurityTax(e3));
        //test socialSecurityTax method
        System.out.println("John's socialSecurityTax : " + ass.socialSecurityTax(e2));





        System.out.println("=======================================================");
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());

        Wrapper cx = new Wrapper(a);
        Wrapper cy = new Wrapper(b);
        swap2(cx,cy);
        System.out.println("After: a=" + cx.e.getName());
        System.out.println("After: b=" + cy.e.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }

    static class Wrapper{
        Employee e;

        public Wrapper(Employee e) {
            this.e = e;
        }
    }

    public static void swap2(Wrapper cx, Wrapper cy) {


        Employee temp = cx.e;
        cx.e = cy.e;
        cy.e = temp;
    }
}
//print result 
//John
//Alice
//Jenny
//3000.0
//Jenny's insuranceCoverage : 74.4
//John's socialSecurityTax : 31.0
//=======================================================
// Before: a=Jenny
// Before: b=John
// After: a=John
// After: b=Jenny
//
//Process finished with exit code 0



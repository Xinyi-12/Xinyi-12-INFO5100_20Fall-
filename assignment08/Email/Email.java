package ttt.java;

import java.util.Random;
import java.util.Scanner;

public class Email {


    private String firstName;
    private String lastName;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companySuffix = "aeycompany.com";
    private String password = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New Worker: "+ firstName + " "+ lastName + ".");
        this.department =  this.setDepartment();
        this.password = randomPassword(defaultPasswordLength);

    }

    // Ask for the department
    public String setDepartment() {

        String dev = "";
        System.out.println("Department Codes: " +
                "\n1 for Sales" +
                "\n2 for Development" +
                "\n3 for Accounting" +
                "\n0 for nome" );
        System.out.println("Enter department code: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        if (line.equals("1")){
            dev = "sal";
        }
        if (line.equals("2")){
            dev = "dev";

        }if (line.equals("3")){
            dev = "acc";

        }if (line.equals("0")){
            dev = null;
        }
        return dev;

    }

    // Generate a random password
    private String randomPassword(int length) {

        Random rand = new Random();
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<length;i++){
            int randNum = rand.nextInt(password.length());
            if(randNum>=password.length()){
                i--;
                continue;
            }
            result.append(password.charAt(randNum));       //将str中的第随机数（randNum）个位置的字符取出来
        }
        return result.toString();
    }

    public String getEmail(){
        StringBuilder sb = new StringBuilder("");
        sb.append(this.firstName.toLowerCase() + "." +this.lastName.toLowerCase() + "." + companySuffix );
        return sb.toString();
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }


    public String showInfo(){
        StringBuilder sb = new StringBuilder("");
        sb.append("DISPLAY NAME: " + this.firstName + " " + this.lastName + "\n");
        sb.append("DEPARTMENT: " + this.department +"\n");
        sb.append("COMPANY EMAIL: " + this.getEmail() + "\n");
        sb.append("PASSWORD: " + this.randomPassword(defaultPasswordLength) + "\n");
        sb.append("MAILBOX CAPACITY: " + this.getMailboxCapacity() + "mb" + "\n");

        return sb.toString();
    }

}

//print out
//New Worker: John Smith.
//Department Codes:
//1 for Sales
//2 for Development
//3 for Accounting
//0 for nome
//Enter department code:
//2
//DISPLAY NAME: John Smith
//DEPARTMENT: dev
//COMPANY EMAIL: john.smith.aeycompany.com
//PASSWORD: C%%BCHBI%C
//MAILBOX CAPACITY: 500mb

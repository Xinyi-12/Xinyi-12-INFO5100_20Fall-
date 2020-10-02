package edu.neu.info5100.assignment03;


import java.util.ArrayList;
import java.util.List;

public class Course {

    private static final int MAX_STUDENT = 10;

    private String name = "";

    private Integer numberOfStudent = 0;

    private List<Student> student ;

    List<Student> students = new ArrayList<>();

    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    public List<Student> getStudent(){
        System.out.println("====student's info in this class====");
        for (Student s : students){
            System.out.println(s);
        }
        return students;
    }


    public boolean isFull(){

        if (students.size() >= MAX_STUDENT){
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void getNumberOfStudent() {
        int numberofstu = students.size();
        System.out.println("====the number of students in this course====");
        System.out.println("Course has " + numberofstu + " students");
    }

    public void registerStudent(Student student){

        if (isFull()){
            System.out.println("not have seat");
        }else {
            students.add(student);
            System.out.println(student.getName() + " register course successful!");
        }
    }
}

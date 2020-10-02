 package edu.neu.info5100.assignment03;

 public class Test {
    public static void main(String[] args) {

        Course course = new Course("course");

        System.out.println("[begin]");

        //test getNumberOfStudent() method
        course.getNumberOfStudent();

        //test registerStudent() method
        //test isFull() method
        Student lisa = new Student("lisa",1001);
        course.registerStudent(lisa);
        Student mike = new Student("mike",1002);
        course.registerStudent(mike);

        //test getStudent() method
        course.getStudent();

        System.out.println("[after add students]");
        course.getNumberOfStudent();

    }
}
//print out :
//[begin]
//====the number of students in this course====
//Course has 0 students
//lisa register course successful!
//mike register course successful!
//====student's info in this class====
//Student{name='lisa', id=1001}
//Student{name='mike', id=1002}
//[after add students]
//====the number of students in this course====
//Course has 2 students

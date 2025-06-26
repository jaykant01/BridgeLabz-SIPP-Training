package Constructors;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if(CGPA >= 0.0 && CGPA <= 10.0){
            this.CGPA = CGPA;
        }else{
            System.out.println("Invalid CGPA");
        }
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Name: " + this.name);
        System.out.println("CGPA: " + this.CGPA);
    }

    public static class PostgraduateStudent {
        private Student student;

        public PostgraduateStudent(Student student){
            this.student = student;
        }

        public void displayPostGraduateStudentDetails() {
            this.student.displayDetails();
        }

    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "James Brown", 10.0);
        Student.PostgraduateStudent s2 = new Student.PostgraduateStudent(s1);
        s2.displayPostGraduateStudentDetails();
    }
}




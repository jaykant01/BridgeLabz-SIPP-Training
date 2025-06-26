package Constructors;

public class Course {
    public String courseName;
    public int duration;
    public double fee;

    static String  instituteName = "Coding Blocks";

    public Course (String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName +
                "Duration: " + duration +
                "Fee: " + fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        // update
        Course.updateInstituteName("BridgeLabz");

        Course course1 = new Course("Java Programming",150,0.0);
        course1.displayCourseDetails();
        Course course2 = new Course("OOP",150,0.0);
        course2.displayCourseDetails();
        Course course3 = new Course("DSA",150,0.0);
        course3.displayCourseDetails();

    }

}

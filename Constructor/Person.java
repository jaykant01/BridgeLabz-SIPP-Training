package Constructors;

public class Person {
    // Instance Variable
     String name;
     int age;

     // parameterized Constructor
     public Person(String name, int age) {
         this.name = name;
         this.age = age;
     }

     // Copy Constructor
    public Person(Person other) {
         this.name = other.name;
         this.age = other.age;
    }

    public void display() {
         System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("Harsh Yadav", 32);

        System.out.println(person1);
        person1.display();

        System.out.println(person2);
        person2.display();
    }

}


package Supervision2;

// Interface
interface Printable {
    void print();
}
// Abstract class
abstract class Person implements Printable {
    String name;
    public Person(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        IO.println("Person can print");
    }
    abstract public void dance();
}

// Class

class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    public void dance() {
        IO.println("Do the student dance");
    }
}
public class Question1 {
    public static void main(String[] args) {

    }
}

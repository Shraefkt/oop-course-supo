package Supervision2;

class A {
    int value = 1;
    public void printValue() {
        IO.println("A");
    }
}

class B extends A {
    int value = 2;
    public void printValue() {
        IO.println("B");
    }
}
public class Question4 {
    public static void main(String[] args) {
    A myObj = new B();
    IO.println(myObj.value);
    myObj.printValue();
    }
}

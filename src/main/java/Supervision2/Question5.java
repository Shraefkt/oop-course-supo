package Supervision2;

class Ninja {
    static void fight() {
        IO.println("fight");
    }
}

class Employee {
    String company;
    Employee(String company) {
        this.company = company;
    }
    void work() {
        IO.println("work");
    }
}

interface NinjaAbilities {
    default void fight() {
        Ninja.fight();
    }
}

class NinjaEmployee extends Employee implements NinjaAbilities {
    NinjaEmployee(String company) {
        super(company);
    }
}
public class Question5 {
}

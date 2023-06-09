package oops_concepts;

import java.io.*;
class Person {
    static Person name = null;
    public int age = 12;

    private Person() {
    }

    static public Person getInstance() {

        if (name == null)
            name = new Person();

        return name;
    }
}

class Age{
    public static void main(String args[]) {
        Person a = Person.getInstance();
        Person b = Person.getInstance();
        a.age = a.age + 10;
        System.out.println("Value of a.age = " + a.age);
        System.out.println("Value of b.age = " + b.age);
    }
}

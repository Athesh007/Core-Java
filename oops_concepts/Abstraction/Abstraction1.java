package oops_concepts.Abstraction;

abstract class Birds {
    public abstract void sound();

    public void sleep() {
        System.out.println("Zzzz");
    }
}

class Parrot extends Birds {
    public void sound() {
        System.out.println("squawk");
    }
}

class Hen extends Birds {
    public void sound() {
        System.out.println("cluck");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.sound();
        parrot.sleep();

        Hen hen = new Hen();
        hen.sound();
        hen.sleep();
    }
}


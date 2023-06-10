package oops_concepts.Polymorphism;

class Vehicle {
    public void drive() {
        System.out.println("Driving the vehicle");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Driving the car");
    }
}

class Bike extends Vehicle {
    public void drive() {
        System.out.println("Driving the bike");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();

        vehicle1.drive();
        vehicle2.drive();
    }
}


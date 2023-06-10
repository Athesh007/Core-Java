package oops_concepts.Inheritance;

public class MultilevelInheritence {
    public static void main(String[] args) {
        Fuel obj = new Fuel();
        obj.car();
        obj.engine_power();
        obj.fuel_rate();
    }
}

class Car {
    void car() {
        System.out.println("This is a Bugatti");
    }
}

class Engine extends Car {
    void engine_power() {
        System.out.println("This is a high Capacity Engine");
    }

}

class Fuel extends Engine {
    void fuel_rate() {
        System.out.println("This is a petrol car");
    }
}
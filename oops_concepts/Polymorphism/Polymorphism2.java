package oops_concepts.Polymorphism;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Shape shape3 = new Triangle();

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}

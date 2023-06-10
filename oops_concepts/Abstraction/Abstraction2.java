package oops_concepts.Abstraction;

abstract class Shape {

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle - Area: " + circle.calculateArea());
        System.out.println("Circle - Perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle - Area: " + rectangle.calculateArea());
        System.out.println("Rectangle - Perimeter: " + rectangle.calculatePerimeter());
    }
}

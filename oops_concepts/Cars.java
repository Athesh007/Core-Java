package oops_concepts;

abstract class Car{
    String color;
    abstract double speed();
    abstract public String toString();
    public Car(String color)
    {
        System.out.println("Car:");
        this.color=color;
    }

    public String getColor()
    {
        return color;
    }
}
class Audi extends Car{
    double speed;
    public Audi(String color,double speed)
    {
        super(color);
        System.out.println("Audi");
        this.speed=speed;
    }
    double speed()
    {
        return speed;
    }
    public String toString()
    {
        return "Audi Color:"+super.color+" speed:"+speed();
    }

}

class Mercedes extends Car {

    double distance;
    double time;

    public Mercedes(String color, double distance, double time) {
        super(color);
        System.out.println("Mercedes");
        this.distance = distance;
        this.time = time;
    }

    @Override
    double speed() {
        return distance/time;
    }

    @Override
    public String toString() {
        return "Mercedes color is " + super.color + "and speed is : " + speed();
    }

}

public class Cars {
    public static void main(String[] args) {
        Car s1 = new Audi("Red", 2.2);
        Car s2 = new Mercedes("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
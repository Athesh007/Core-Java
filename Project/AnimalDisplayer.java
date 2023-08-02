package Project;

import java.util.*;

public class AnimalDisplayer {
    private List<Animal> animals;

    public AnimalDisplayer(List<Animal> animals) {
        this.animals = animals;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName() + ", Age: " + animal.getAge());
            animal.makeSound();
            if (animal instanceof Mammal) {
                Mammal mammal = (Mammal) animal;
                System.out.println("Fur Color: " + mammal.getFurColor());
            } else if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                System.out.println("Can Fly: " + bird.canFly());
            }
            System.out.println();
        }
    }
}

package Project;

import java.util.*;

public class VirtualZoo {
    private List<Animal> animals;
    private Scanner scanner;

    public VirtualZoo() {
        animals = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public static void main(String[] args) {
        VirtualZoo zoo = new VirtualZoo();
        AnimalCreator animalCreator = new AnimalCreator();
        AnimalDisplayer animalDisplayer = new AnimalDisplayer(zoo.animals);

        int choice;

        do {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("------------------ Virtual Zoo Management System -----------------------");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1. Add Animal");
            System.out.println("2. Display Animals");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(zoo.scanner.nextLine());

            switch (choice) {
                case 1:
                    Animal newAnimal = animalCreator.createAnimal();
                    zoo.addAnimal(newAnimal);
                    System.out.println("Animal added successfully!");
                    break;
                case 2:
                    animalDisplayer.displayAnimals();
                    break;
                case 3:
                    System.out.println("Exiting the Virtual Zoo Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        zoo.scanner.close();
    }
}

package Project;

import java.util.*;

public class AnimalCreator {
    private Scanner scanner;

    public AnimalCreator() {
        scanner = new Scanner(System.in);
    }
    public Animal createAnimal() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("---------------------------- Animal Details ----------------------------");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Enter animal name:");
        String name = scanner.nextLine();

        System.out.println("Enter animal age:");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Is it a mammal? (Y/N):");
        boolean isMammal = scanner.nextLine().equalsIgnoreCase("Y");

        if (isMammal) {
            System.out.println("Enter fur color:");
            String furColor = scanner.nextLine();
            return new Mammal(name, age, furColor);
        } else {
            System.out.println("Can it fly? (Y/N):");
            boolean canFly = scanner.nextLine().equalsIgnoreCase("Y");
            return new Bird(name, age, canFly);
        }
    }
}

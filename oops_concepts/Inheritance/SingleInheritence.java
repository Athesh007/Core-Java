package oops_concepts.Inheritance;

import java.util.*;

class SingleInheritence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        country obj = new country();
        System.out.println("Enter the countries from the given list");
        System.out.println("India , England , Ohio , Pakisthan , Maldives , Nigeria");
        String name = sc.nextLine();
        obj.continent_printer(name);
        obj.country_printer(name);
    }
}

class continent {
    void continent_printer(String name) {
        if (name.equals("India")) {
            System.out.println("This is Asia");
        } else if (name.equals("England")) {
            System.out.println("This is Europe");
        } else if (name.equals("Ohio")) {
            System.out.println("This is Usa");
        } else if (name.equals("Pakisthan")) {
            System.out.println("This is Asia");
        } else if (name.equals("Maldives")) {
            System.out.println("This is Asia");
        } else if (name.equals("Nigeria")) {
            System.out.println("This is Africa");
        } else {
            System.out.println("Unrecognized Country");
        }
    }
}

class country extends continent {
    void country_printer(String name) {
        System.out.println("You are in the country " + name);
    }
}
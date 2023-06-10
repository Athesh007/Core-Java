package oops_concepts.Encapsulation;

class Employee {
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Ramesh");
        emp.setAge(30);
        emp.setSalary(80000.0);

        System.out.println("Employee Information:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
    }
}


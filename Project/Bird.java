package Project;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound: Chirp");
    }

    public boolean canFly() {
        return canFly;
    }
}

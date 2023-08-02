package Project;

public class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal sound: Roar");
    }

    public String getFurColor() {
        return furColor;
    }
}

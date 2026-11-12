package agh.po.animals;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name, 2);
    }
    @Override
    public String getDescription() {
        return "Papuga: " + name + " (nogi: " + legs + ")";
    }

    @Override
    public void makeSound() {
        System.out.println("Papuga skrzeczy: Kraa!");
    }

}

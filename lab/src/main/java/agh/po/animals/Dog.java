package agh.po.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, 4);
    }

    @Override
    public String getDescription() {
        return "Pies: " + name + " (nogi: " + legs + ")";
    }

    @Override
    public void makeSound() {
        System.out.println("Pies szczeka: Hau hau!");
    }
}

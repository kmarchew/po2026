package agh.po.animals;

public class Snake extends Animal {
    public Snake(String name) {
        super(name, 0);
    }

    @Override
    public String getDescription() {
        return "Wąż: " + name + " (nogi: " + legs + ")";
    }

    @Override
    public void makeSound() {
        System.out.println("Wąż syczy: Sssss!");
    }
}

package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];

    public void Zoofill() {
        Random random = new Random();
        for (int i=0; i < 100; i++) {
            int type = random.nextInt(3);
            if (type == 0) {
                animals[i] = new Dog("Dog_"+i);
            } else if (type == 1) {
                animals[i] = new Parrot("Parrot_"+i);
            } else if (type == 2) {
                animals[i] = new Snake("Snake_"+i);
            }
        }
    }
    public int LegSum() {
        int sumLeg = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                sumLeg += animal.getLegs();
            }
        }
        return sumLeg;

    }
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.Zoofill();

        System.out.println("Suma nóg: " + zoo.LegSum());

    }
}

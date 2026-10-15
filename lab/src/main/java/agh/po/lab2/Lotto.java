package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random random = new Random();
        while (wylosowane.size() < 6){
            int liczba = random.nextInt(49) + 1;
            System.out.println(liczba);
            if (!wylosowane.contains(liczba)){
                wylosowane.add(liczba);
            }
        }

        ArrayList<Integer> moje_liczby = new ArrayList<>();






        System.out.println(moje_liczby);
        System.out.println(wylosowane);
        System.out.println(random);
}
}

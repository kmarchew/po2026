package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

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
        for (String arg : args) {
            moje_liczby.add(Integer.parseInt(arg));
        }

        int trafienia = 0;
        for (int liczba : moje_liczby) {
            if (wylosowane.contains(liczba)) {
                trafienia++;
            }
        }

        System.out.println("Twoje typy: " + moje_liczby);
        System.out.println("Wylosowane liczby: " + wylosowane);
        System.out.println("Liczba trafień: " + trafienia);


    }
}

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
            int liczba = Integer.parseInt(arg);
            if (liczba >= 1 && liczba <= 49) {
                if (!moje_liczby.contains(liczba)) {
                    moje_liczby.add(liczba);
                } else {
                    System.out.println("liczba " + liczba + "się powtarza");
                }
            } else {
                System.out.println("liczba " + liczba + " poza zakresem");
            }
        }

        int trafienia = 0;
        for (int liczba : moje_liczby) {
            if (wylosowane.contains(liczba)) {
                trafienia++;
            }
        }

        if (moje_liczby.size() == 6) {
            long start_Time = System.currentTimeMillis();
            long l_prob = 0;

            while (true) {
                l_prob++;
                ArrayList<Integer> nowe_losowania = new ArrayList<>();
                while (nowe_losowania.size() < 6) {
                    int liczba = random.nextInt(49) + 1;
                    if (!nowe_losowania.contains(liczba)) {
                        nowe_losowania.add(liczba);
                    }
                }
                if (nowe_losowania.containsAll(moje_liczby)){
                    break;
                }
            }
            long endTime = System.currentTimeMillis();
            long czasDzialania = endTime - start_Time;

            System.out.println("\n--- Symulacja 6/6 ---");
            System.out.println("iloś losowań: " + l_prob);
            System.out.println("czas działania programu: " + czasDzialania + " ms");

        }

        System.out.println("Twoje typy: " + moje_liczby);
        System.out.println("Wylosowane liczby: " + wylosowane);
        System.out.println("Liczba trafień: " + trafienia);


    }
}

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
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź 6 liczb całkowitych:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Podaj liczbę " + (i + 1) + ": ");
            int liczba = scan.nextInt();
            moje_liczby.add(liczba);
        }
        scan.close();

        System.out.println(moje_liczby);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe lotto:");
//        while (true) {
//            String moje_liczby = scan.nextLine();
//            if (moje_liczby)
//        }

        System.out.println(wylosowane);
        System.out.println(random);
    }
}

package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;
    private double aktualnePrzelozenie;
    private Sprzeglo sprzeglo;

    public SkrzyniaBiegow(String nazwa, double waga, double cena, String producent, String model, int iloscBiegow, Sprzeglo sprzeglo) {
        super(nazwa, waga, cena, producent, model);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
        this.aktualnyBieg = 0; // 0 oznacza bieg jałowy (luz)
        this.aktualnePrzelozenie = 0.0;
    }

    public void zwiekszBieg() {
        this.aktualnyBieg += 1;
        System.out.println("Zmieniono bieg na wyższy");
    }

    public void zmniejszBieg() {
        this.aktualnyBieg -= 1;
        System.out.println("Zmieniono bieg na niższy");
    }

    public int getAktualnyBieg(){
        return aktualnyBieg;
    }

    public int getIloscBiegow(){
        return iloscBiegow;
    }
    public Sprzeglo getSprzeglo() {
        return sprzeglo;
    }


}

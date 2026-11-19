package agh.po.symulator;

public class Samochod {
    private boolean stanWlaczenia;
    private String nrRejest;
    private String model;
    private double predkoscMax;
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Sprzeglo sprzeglo;
    private Pozycja aktualnaPozycja;

    public Samochod(String nrRejest, String model, double predkoscMax, Silnik silnik, SkrzyniaBiegow skrzynia, Pozycja aktualnaPozycja) {
        this.nrRejest = nrRejest;
        this.model = model;
        this.predkoscMax = predkoscMax;
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.aktualnaPozycja = aktualnaPozycja;
        this.stanWlaczenia = false;
    }

    public void wlacz() {
        if (!stanWlaczenia) {
            stanWlaczenia = true;
            silnik.uruchom();
        }
    }

    public void wylacz() {
        if (stanWlaczenia) {
            stanWlaczenia = false;
            silnik.zatrzymaj();
        }
    }

    public void jedzDo(Pozycja cel) {
        if (!stanWlaczenia || skrzynia.getAktualnyBieg() == 0) {
            System.out.println("Samochód nie może ruszyć (silnik wyłączony lub skrzynia na luzie).");
            return;
        }
        double deltaX = cel.getX() - aktualnaPozycja.getX();
        double deltaY = cel.getY() - aktualnaPozycja.getY();
        aktualnaPozycja.aktualizujPozycje(deltaX, deltaY);
        System.out.println("Samochód " + model + " dojechał do pozycji: " + aktualnaPozycja.getPozycja());
    }

    public double getWaga() {
        // Sumuje wagę komponentów składowych (z uwzględnieniem sprzęgła wewnątrz skrzyni)
        return silnik.getWaga() + skrzynia.getWaga() + skrzynia.getSprzeglo().getWaga();
    }

    public double getAktPredkosc() {
        if (!stanWlaczenia || skrzynia.getAktualnyBieg() == 0) {
            return 0.0;
        }
        // Obliczenie prędkości na podstawie obrotów i przełożenia z ograniczeniem do predkoscMax
        double obliczonaPredkosc = (silnik.getAktualneObroty() / 100.0) * skrzynia.getAktualnyBieg() * 2.5;
        return Math.min(obliczonaPredkosc, predkoscMax);
    }

    public Pozycja getAktPozycja() {
        return aktualnaPozycja;
    }

    public String getModel() {
        return model;
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public SkrzyniaBiegow getSkrzynia() {
        return skrzynia;
    }
}
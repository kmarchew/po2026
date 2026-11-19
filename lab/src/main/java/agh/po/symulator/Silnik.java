package agh.po.symulator;

public class Silnik extends Komponent {
    private int maxObroty;
    private int obroty;

    public Silnik(String nazwa, double waga, double cena, String producent, String model, int maxObroty) {
        super(nazwa, waga, cena, producent, model);
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }

    public void uruchom() {
        this.obroty += 1250;
        System.out.println("Uruchomiono silnik");
    }
    public void zatrzymaj() {
        this.obroty += 0;
        System.out.println("Zgaszono silnik");
    }
    public int getAktualneObroty() {
        return obroty;
    }
    public int getMaxOboroty(){
        return maxObroty;
    }
}

package agh.po.symulator;


public class Main {
    public static void main(String[] args) {
        Silnik silnik = new Silnik("Toyota", "1.8", 6000);
        SkrzyniaBiegów skrzynia = new SkrzyniaBiegów("Bosch", "Manual", 5);
        Sprzęgło sprzęgło = new Sprzęgło("Valeo", "Standard");
        Pozycja pozycja = new Pozycja(0.0, 0.0);

        Samochód samochód = new Samochód(silnik, skrzynia, sprzęgło, pozycja);

        samochód.włącz();

        skrzynia.zwiększBieg();
        skrzynia.zwiększBieg();
        skrzynia.zmniejszBieg();
        pozycja.aktualizujPozycję(10.0, 5.0);

        System.out.println("AKTUALNY STAN SAMOCHODU");
        System.out.println("Obroty silnika: " + silnik.getObroty());
        System.out.println("Aktualny bieg: " + skrzynia.getAktualnyBieg());
        System.out.println("Stan sprzęgła (wciśnięte?): " + sprzęgło.getStanSprzęgła());
        System.out.println("Pozycja pojazdu: " + pozycja.getPozycja());

        samochód.wyłącz();
    }
}

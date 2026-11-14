package symulator;

public class Samochód {
    private Silnik silnik;
    private SkrzyniaBiegów skrzynia;
    private Sprzęgło sprzęgło;
    private Pozycja pozycja;

    public Samochód(Silnik silnik, SkrzyniaBiegów skrzynia, Sprzęgło sprzęgło, Pozycja pozycja) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.sprzęgło = sprzęgło;
        this.pozycja = pozycja;
    }

    public void włącz() {
        if (silnik != null) {
            silnik.uruchom();
        }
    }

    public void wyłącz() {
        if (silnik != null) {
            silnik.zatrzymaj();
        }
        if (skrzynia != null) {
            skrzynia.ustawBieg(0);
        }
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public SkrzyniaBiegów getSkrzynia() {
        return skrzynia;
    }

    public Sprzęgło getSprzęgło() {
        return sprzęgło;
    }

    public Pozycja getPozycja() {
        return pozycja;
    }
}

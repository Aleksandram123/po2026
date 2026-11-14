package symulator;

public class Silnik extends Komponent {
    private int maxObroty;
    private int obroty;
    private boolean stanSilnika;

    public Silnik(String producent, String model, int maxObroty) {
        super(producent, model);
        this.maxObroty = maxObroty;
        this.obroty = 0;
        this.stanSilnika = false;
    }

    public void uruchom() {
        this.stanSilnika = true;
        this.obroty = 1000; // Przykładowe obroty biegu jałowego
    }

    public void zatrzymaj() {
        this.stanSilnika = false;
        this.obroty = 0;
    }


    public int getObroty() {
        return obroty;
    }

    public boolean getStanSilnika() {
        return stanSilnika;
    }
}
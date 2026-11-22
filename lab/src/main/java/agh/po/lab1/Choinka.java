package agh.po.lab1;

public class Choinka {

    public static final int WYSOKOSC = 5;

    public static void rysuj(int wysokosc) {
        for (int i = 1; i <= wysokosc; i++) {
            for (int j = 1; j <= wysokosc - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int wysokosc = WYSOKOSC;
        if (args.length > 0) {
            try {
                wysokosc = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Argument musi byc liczba calkowita. Uzywam wysokosci " + WYSOKOSC);
            }
        }
        rysuj(wysokosc);
    }
}
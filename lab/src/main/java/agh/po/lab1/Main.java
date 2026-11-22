package agh.po.lab1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();

        Choinka.rysuj(Choinka.WYSOKOSC);
        System.out.println();

        if (args.length > 0) {
            Choinka.rysuj(Integer.parseInt(args[0]));
        }
    }
}

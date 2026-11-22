package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Podaj dokladnie 6 liczb, np.: 1 2 3 5 8 9");
            return;
        }

        ArrayList<Integer> typy = new ArrayList<>();
        for (String arg : args) {
            typy.add(Integer.parseInt(arg));
        }

        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random random = new Random();
        while (wylosowane.size() < 6) {
            int wylosowanaLiczba = random.nextInt(49) + 1;
            if (!wylosowane.contains(wylosowanaLiczba)) {
                wylosowane.add(wylosowanaLiczba);
            }
        }

        ArrayList<Integer> trafione = new ArrayList<>(wylosowane);
        trafione.retainAll(typy);

        System.out.println("Twoje typy: " + typy);
        System.out.println("Wylosowane liczby: " + wylosowane);
        System.out.println("Liczba trafien: " + trafione.size());
    }
}




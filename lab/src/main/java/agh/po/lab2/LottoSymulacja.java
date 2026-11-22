package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class LottoSymulacja {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        ArrayList<Integer> typy = new ArrayList<>();
        typy.add(1);
        typy.add(2);
        typy.add(3);
        typy.add(4);
        typy.add(5);
        typy.add(6);

        Random random = new Random();
        long liczbaLosowan = 0;
        int trafienia = 0;

        while (trafienia < 6) {
            ArrayList<Integer> wylosowane = new ArrayList<>();
            while (wylosowane.size() < 6) {
                int wylosowanaLiczba = random.nextInt(49) + 1;
                if (!wylosowane.contains(wylosowanaLiczba)) {
                    wylosowane.add(wylosowanaLiczba);
                }
            }
            liczbaLosowan++;

            wylosowane.retainAll(typy);
            trafienia = wylosowane.size();
        }

        long czas = System.currentTimeMillis() - start;

        System.out.println("Trafienie 6/6 po " + liczbaLosowan + " losowaniach");
        System.out.println("Czas dzialania: " + czas + " ms");
    }
}

package agh.po.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> liczby = new HashSet<>();

        while (liczby.size() < 6) {
            liczby.add(random.nextInt(49) + 1);
        }

        List<Integer> posortowane = new ArrayList<>(liczby);
        Collections.sort(posortowane);

        System.out.println("Wylosowane liczby: " + posortowane);
    }
}

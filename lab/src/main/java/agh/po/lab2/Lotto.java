package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;

public class Lotto{
public static void main(String[] args){
    ArrayList<Integer> wylosowane=new ArrayList<>();
    Random random =new Random();
    while (wylosowane.size()<6){
        int wylosowanaLiczba=random.nextInt(49)+1;
        if(!wylosowane.contains(wylosowanaLiczba)) {
            wylosowane.add(wylosowanaLiczba);
        }
    }
    System.out.println(wylosowane);

    }
}




package agh.po.lab4.zadania;

import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Parrot;
import agh.po.lab4.animals.Snake;

import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Random random = new Random();

        String[] names = {"Burek", "Azor", "Borys", "Mimi", "Reksio", "Miko", "Puszek", "Riko"};

        for (int i = 0; i < animals.length; i++) {
            int animalType = random.nextInt(3);
            String randomName = names[random.nextInt(names.length)] + i;

            if (animalType == 0) {
                animals[i] = new Dog(randomName);
            } else if (animalType == 1) {
                animals[i] = new Parrot(randomName);
            } else {
                animals[i] = new Snake(randomName);
            }
        }

        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.getDescription());
                animal.makeSound();
            }
        }

        int totalLegs = calculateTotalLegs(animals);
        System.out.println("\nŁączna suma nóg wszystkich zwierząt w zoo wynosi: " + totalLegs);
    }

    public static int calculateTotalLegs(Animal[] animals) {
        int sum = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                sum += animal.getLegs();
            }
        }
        return sum;
    }
}
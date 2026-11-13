package agh.po.lab4.animals;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name, 2);
    }

    @Override
    public String getDescription() {
        return "Papuga o imieniu " + name + ", ma " + legs + " nogi.";
    }

    @Override
    public void makeSound() {
        System.out.println("Ćwir ćwir!");
    }
}
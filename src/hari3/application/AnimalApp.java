package hari3.application;

import hari3.data.Animal;
import hari3.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();

        animal.name = "Puss";
        animal.run();
    }
}

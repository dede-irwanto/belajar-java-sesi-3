package hari3.application;

import hari3.annotation.Fancy;
import hari3.data.Animal;
import hari3.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"}) // annotation
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();

        animal.name = "Puss";
        animal.run();
    }
}

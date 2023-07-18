package hari3.application;

import hari3.data.Avanza;
import hari3.data.Bus;
import hari3.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        System.out.println(car.getBrand());
        car.drive();

        Car bus = new Bus();
        System.out.println(bus.getTier());
        System.out.println(bus.getBrand());
        System.out.println(bus.isBig());
        bus.drive();
    }
}

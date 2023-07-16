package hari3.application;

import hari3.data.City;
import hari3.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // error

        var city = new City();
        city.name = "Kotamobagu";

        System.out.println(city.name);
    }
}

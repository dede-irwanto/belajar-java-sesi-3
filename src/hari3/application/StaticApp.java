package hari3.application;

import hari3.data.Application;
import hari3.data.Constant;
import hari3.data.Country;
import hari3.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtil.sum(1,1,1,1,1,1));

        Country.City city = new Country.City();
        city.setName("Kotamobagu");

        System.out.println(city.getName());
        System.out.println(Application.PROCESSORS);
    }
}

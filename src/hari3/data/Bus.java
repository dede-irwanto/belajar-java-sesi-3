package hari3.data;

public class Bus implements Car, IsMaintenance {
    public void drive() {
        System.out.println("Bus drive");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "HINO";
    }

    public boolean isBig() {
        return true;
    }

    public boolean isMaintenance() {
        return true;
    }
}

package hari3.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Dede";
        first = first + " " + "Irwanto";
        System.out.println(first);

        String second = "Dede Irwanto";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}

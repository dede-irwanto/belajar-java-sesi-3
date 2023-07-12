package hari1;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Dede";
        manager.sayHello("Budi");

        var vp = new VicePresident();
        vp.name = "Eka";
        vp.sayHello("Budi");

    }
}

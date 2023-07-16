package hari3;

public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Dede";
        child.doIt();
        System.out.println(child.name);

        // variable hiding
        Parent parent = child;
        parent.doIt();
        System.out.println(parent.name);
    }
}

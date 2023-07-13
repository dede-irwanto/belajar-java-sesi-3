package hari2;

// polymorphism
public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Dede");
        employee.sayHello("Budi");

        employee = new Manager("Dede");
        employee.sayHello("Budi");

        employee = new VicePresident("Dede");
        employee.sayHello("Budi");

        sayHello(new Employee("Dede"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Budi"));
    }

    // method polymorphism
    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}

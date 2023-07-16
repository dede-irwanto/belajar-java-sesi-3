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
        // type check and cast
        if (employee instanceof VicePresident) { // type check
            VicePresident vicePresident = (VicePresident) employee; //cast
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) { // type check
            Manager manager = (Manager) employee; //cast
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}

package hari1;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // contructor
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // contructor overloading
    Person(String name) {
        //memanggil constructor lain
        this(name, null);
    }

    // contructor overloading
    Person() {
        this(null);
    }

    void sayHello(String name) {
        System.out.println("Hello " + this.name + ", My name is " + name);
    }
}

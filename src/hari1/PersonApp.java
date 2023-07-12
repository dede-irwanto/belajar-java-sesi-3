package hari1;

public class PersonApp {
    public static void main(String[] args) {
        // membuat object -> menggunakan kata kunci new
        var person1 =  new Person("Dede", "Bolmong");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Eka");

        Person person2 = new Person("Eka");

        Person person3;
        person3 = new Person();
        person3.name = "Deeva";
        person3.sayHello("Eka");


    }
}

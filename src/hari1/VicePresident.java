package hari1;

import javax.xml.namespace.QName;

// inheritance
public class VicePresident extends Manager {
    VicePresident(String name) {
        // kata kunci super untuk memanggil parent constructor
        super(name);
    }
    // method overriding
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is VP " + this.name);
    }
}

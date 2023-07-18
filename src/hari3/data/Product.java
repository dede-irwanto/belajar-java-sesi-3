package hari3.data;

import java.util.Objects;

public class Product {
    protected String name;
    protected int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // toString method
    public String toString() {
        return "Product name: " + name + ", price: " + price;
    }

    // equals method override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}

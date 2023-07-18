package hari3.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 30000000);

        System.out.println(product.toString());

        Product product2 = new Product("Mac Book Pro", 30000000);

        System.out.println(product.equals(product2)); // jika method equals tidak di override maka nilai yg akan dikembalikan adalah dr memory sehinga hasilnya false
        System.out.println(product.hashCode() == product2.hashCode());
    }
}

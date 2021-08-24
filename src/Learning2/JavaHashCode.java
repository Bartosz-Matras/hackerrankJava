package Learning2;

import java.util.Objects;

public class JavaHashCode {

    public static int suma(int arg0, int... args){
        int wynik = arg0;

        for (int i=0; i<args.length; i++){
            wynik += args[i];
        }
        return wynik;
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Czekolada", 2.99);
        Product prod2 = new Product("Czekolada", 2.99);
        System.out.println(prod1.equals(prod2));
        System.out.println(prod1.hashCode());
        System.out.println(prod2.hashCode());

        System.out.println();
        System.out.println();

        // Metody o zmiennej liczbie argumentów
        System.out.println(suma(3) + " ");
        System.out.println(suma(3,3) + " ");
        System.out.println(suma(3,3,3) + " ");
        System.out.println(suma(3,3,3,3,3,3) + " ");

    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }
}
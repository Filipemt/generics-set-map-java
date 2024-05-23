package application;

import model.entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // A classe do conjunto TreeSet precisa ser uma implementação do Comparable para que o TreeSet possa ordenar os objetos

        Set<Product> set = new TreeSet<>();

        set.add(new Product("Tv", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }

    }
}
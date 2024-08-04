package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 5, "Delicious dark chocolate", "Belgium");
        products[1] = new Coke("Coke", 2, "Refreshing beverage", false);
        products[2] = new Bread("Bread", 3, "Freshly baked bread", 250);

        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for(int i=0;i<products.length;i++){
            products[i].showDetails();
        }
    }
}
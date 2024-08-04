package org.example.model;

public class Bread extends ProductForSale{

    private int grams;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, int grams) {
        super(type, price, description);
        this.grams = grams;
    }

    @Override
    public void showDetails() {
        System.out.printf("this bread is %d grams",grams);
    }
}

package org.example.model;

public class Chocolate extends ProductForSale{
    private String madeBy;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description, String madeBy) {
        super(type, price, description);
        this.madeBy = madeBy;
    }

    @Override
    public void showDetails() {
        System.out.printf("this chocolate is a %s creation",madeBy);
    }
}

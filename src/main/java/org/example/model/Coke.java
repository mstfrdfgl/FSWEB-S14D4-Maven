package org.example.model;

public class Coke extends ProductForSale{

    private boolean salty;
    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, boolean salty) {
        super(type, price, description);
        this.salty = salty;
    }

    @Override
    public void showDetails() {
        System.out.println("this cookie is " + (salty ? "salty":"sweet"));
    }
}

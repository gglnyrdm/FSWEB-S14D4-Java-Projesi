package com.workintech.abstraction.product;

public class Bread extends ProductForSale{
    private String flourType;
    private String color;
    public Bread(String type, double price, String description, String color, String flourType) {
        super(type, price, description);
        this.color=color;
        this.flourType=flourType;
    }

    public String getFlourType() {
        return flourType;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("FlourType: " + flourType + "\n");
        builder.append("Color: " + color + "\n");
        System.out.println(result + builder.toString());
    }

}

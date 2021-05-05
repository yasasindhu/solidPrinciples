package com.company;

public class Product {
    private String name;
    private float price;
    private String color;
    private String size;
    Product(String name,float price,String color,String size){
        this.name=name;
        this.price=price;
        this.color=color;
        this.size=size;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

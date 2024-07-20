package com.example.proyectoatenea.model;

public class Product {
    private String name;
    private double price;
    private String id;


    public Product(String id, String name, int priceIndex) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return (int) price;
    }

}


package com.mycompany.mavenproject1.Entity;

public class nameProduct {
//inicializar variables
    public String name;
    public int stock;
    public double price;
//cosntructor vacio
    public nameProduct() {
    }
//contructor inicializa las varibles
    public nameProduct(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

  //Getters & Setters (cosultas de peticion (get) y consulta de ingreso (set)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

package com.example.domain;

import java.io.Serializable;

public class Order implements Serializable {
    private int id;
    private String book_name;
    private double price;
    private int count;
    private double sumprice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSumprice() {
        return sumprice;
    }

    public void setSumprice(double sumprice) {
        this.sumprice = sumprice;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", book_name='" + book_name + '\'' + ", price=" + price +
                ", count=" + count +
                ", sumprice=" + sumprice +
                '}';
    }

    public Order() {}

    public Order(int id, String book_name, double price, int count) {
        this.id = id;
        this.book_name = book_name;
        this.price = price;
        this.count = count;
        sumprice = count*price;
    }
}

package com.example.domain;

import java.io.Serializable;

public class Book implements Serializable {

    private int id;
    private String book_name;
    private String author;
    private double price;
    public Book(){}
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  Book (int id, String book_name, String author, double price) {
        this.id = id;
        this.book_name = book_name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", book_name='" + book_name + '\'' +
                ", author='" + author + '\'' + ", price=" + price + '}';
    }
}

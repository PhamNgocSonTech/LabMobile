package com.code.javabasic;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qlyInStock;

    public Book(String name, Author author, double price, int qlyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qlyInStock = qlyInStock;
    }

    public Book() {

    }

    
    @Override
    public String toString() {
        return "Book [author=" + author + ", name=" + name + ", price=" + price + ", qlyInStock=" + qlyInStock + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQlyInStock() {
        return qlyInStock;
    }

    public void setQlyInStock(int qlyInStock) {
        this.qlyInStock = qlyInStock;
    }

}

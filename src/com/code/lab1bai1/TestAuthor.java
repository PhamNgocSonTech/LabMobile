package com.code.lab1bai1;

public class TestAuthor {
    public static void main(String[] args) {
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        // System.out.println(anAuthor.getName());
        // System.out.println(anAuthor.getEmail());
        // System.out.println(anAuthor.getName());
        // System.out.println(anAuthor.toString());
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        Book anotherBook = new Book("More Java for dummy", new Author("Keigo", "keigo@gmail.com", 'm'), 20, 1500);

        System.out.println(aBook.getName());
        System.out.println(aBook.getPrice());
        System.out.println(aBook.getQlyInStock());
        System.out.println(aBook.getAuthor());
        System.out.println();
        System.out.println(anotherBook.getName());
        System.out.println(anotherBook.getPrice());
        System.out.println(anotherBook.getQlyInStock());
        System.out.println(anotherBook.getAuthor());


    }
}

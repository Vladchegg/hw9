package ru.skypro;

import lesson9.Author;
import lesson9.Book;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Author author1 = new Author("Dmitry", "Glukhovsky");
        Book book1 = new Book("Text", author1, 2017);
        System.out.println("book1.name = " + book1.getName());
        System.out.println("author1 = " + author1.getName() + " " + author1.getSurname());
        System.out.println("book1.publicationYear = " + book1.getPublicationYear());

        Author author2 = new Author("Oscar", "Wilde");
        Book book2 = new Book("The Picture of Dorian Gray", author2, 1890);
        System.out.println("book2.name = " + book2.getName());
        System.out.println("author2 = " + author2.getName() + " " + author2.getSurname());
        System.out.println("book2.publicationYear = " + book2.getPublicationYear());

        book1.setPublicationYear(2015);
        System.out.println("book1.publicationYear = " + book1.getPublicationYear());


    // HOMEWORK 10
        System.out.println("book1 = " + book1);
        Book book3 = new Book("text", author1, 2017);
        System.out.println(book1.equals(book3));
        Author author3 = new Author("Dmitry", "Glukhovsky");
        System.out.println(author1.equals(author3));

    }
}

package lesson9;

import java.util.Objects;

public class Book {
    private String name;
    Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public String getName() {
        return this.name;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // HOMEWORK 10
    public String toString () {
        return "Наименование книги: " + this.name + ", " + this.author + ", Год издания: " + this.publicationYear;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        if (this == other) {
            return true;
        }
        Book book1 = (Book) other;
        return name.equals(book1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

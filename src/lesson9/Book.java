package lesson9;

public class Book {
    private String name;
    Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
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


}

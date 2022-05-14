package lesson9;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }

    // HOMEWORK 10
    public String toString() {
        return "Имя и Фамилия автора: " + this.name + " " + this.surname;
    }

    public boolean equals(Object A) {
        if (this.getClass() != A.getClass()) {
            return false;
        }
        if (this == A) {
            return true;
        }
        Author author1 = (Author) A;
        return surname.equals(author1.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }
}

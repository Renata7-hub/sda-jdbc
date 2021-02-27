package Library.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.UUID;


@Entity
@Table(name = "authors")
public class Author {
        private UUID uuid;
        private String name;
        private String surname;

        @OneToMany
        private Book book;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", book=" + book +
               '}';
    }
}

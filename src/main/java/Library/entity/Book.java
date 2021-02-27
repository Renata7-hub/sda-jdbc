package Library.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Entity
@Table(name = "books")
public class Book {

    private UUID uuid;
    @ManyToOne
    private Author author;
    private String title;
    private String genre;
    private String language;
    private Date releaseDate;
    private String publishingHouse;
    private Integer numberOfPages;
    private String format;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Book{" +
               "author=" + author +
               ", title='" + title + '\'' +
               ", genre='" + genre + '\'' +
               ", language='" + language + '\'' +
               ", releaseDate=" + releaseDate +
               ", publishingHouse='" + publishingHouse + '\'' +
               ", numberOfPages=" + numberOfPages +
               ", format='" + format + '\'' +
               '}';
    }
}

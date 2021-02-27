package Library.entity;

import javax.persistence.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.UUID;

@Entity
@Table(name = "borrowing")
public class BookBorrowing {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
                    .withLocale(Locale.forLanguageTag("LT"))
                    .withZone(ZoneId.systemDefault());

    @Id
    @GeneratedValue
    private UUID id;
    @Column(nullable = false)
    @OneToOne
    private Book book;
    @Column (nullable = false)
    private Instant startTerm;
    @Column (nullable = false)
    private Instant endTerm;
    private String comment;

    public BookBorrowing(UUID id, Book book, Instant startTerm, Instant  endTerm, String comment) {
        this.id = id;

        this.book = book;
        this.startTerm = startTerm;
        this.endTerm = endTerm;
        this.comment = comment;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Book book() {
        return book;
    }

    public void setName(Book book) {
        this.book = book;
    }

    public Instant getStartTerm() {
        return startTerm;
    }

    public void setStartTerm(Instant startTerm) {
        this.startTerm = startTerm;
    }

    public Instant getEndTerm() {
        return endTerm;
    }

    public void setEndTerm(Instant endTerm) {
        this.endTerm = endTerm;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "BookBorrowing{" +
                "id=" + id +
                ", book='" + book + '\'' +
                ", startTerm=" + FORMATTER.format(startTerm)+
                ", endTerm=" + endTerm +
                ", comment='" + comment + '\'' +
                '}';
    }
}

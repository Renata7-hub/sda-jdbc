package Library.Entity;

import javax.persistence.*;
import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue()
    private UUID id;

    @ManyToOne
    private Book book;

    @ManyToOne
    private Reader reader;

    @Column(nullable = false)
    private Instant beginDate;

    @Column(nullable = false)
    private Instant endDate;

    public Reservation(UUID id, Book book, Reader reader, Instant beginDate, Instant endDate) {
        this.id = id;
        this.book = book;
        this.reader = reader;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Instant getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Instant beginDate) {
        this.beginDate = beginDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }
}

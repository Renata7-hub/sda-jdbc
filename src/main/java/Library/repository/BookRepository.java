package Library.repository;

import Library.entity.Book;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.UUID;

public class BookRepository extends AbstractRepository<Book,UUID> {
    public BookRepository(EntityManager entityManager) {
        super(entityManager, Book.class);
    }

    @Override
    public List<Book> findAll() {
        return entityManager.createQuery("FROM Book", Book.class).getResultList();
    }
}



package Repository;

import Library.Entity.Book;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.UUID;

public class BookBorrowingRepository extends AbstractRepository<Book, UUID> {

    public BookBorrowingRepository(EntityManager entityManager, Class<? extends Book> entityClass) {
        super(entityManager, entityClass);
    }

    @Override
    public List findAll() {
        return null;
    }

}

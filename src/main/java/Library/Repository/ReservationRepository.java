package Library.Repository;

import Library.Entity.Reservation;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.UUID;

public class ReservationRepository<T, ID> extends AbstractRepository<Reservation, UUID> {

    public ReservationRepository(EntityManager entityManager, Class<? extends Reservation> entityClass) {
        super(entityManager, entityClass);
    }

    @Override
    public List<Reservation> findAll() {
        return entityManager.createQuery("FROM Reservation", Reservation.class).getResultList();
    }
}

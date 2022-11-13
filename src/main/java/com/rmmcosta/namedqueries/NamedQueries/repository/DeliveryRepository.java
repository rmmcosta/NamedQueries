package com.rmmcosta.namedqueries.NamedQueries.repository;

import com.rmmcosta.namedqueries.NamedQueries.data.Delivery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class DeliveryRepository {
    @PersistenceContext
    EntityManager entityManager;

    public List<Delivery> findByName(String name) {
        TypedQuery<Delivery> query = entityManager.createNamedQuery("Delivery.findByName", Delivery.class);
        query.setParameter("name", name);
        List<Delivery> deliveries = query.getResultList();
        return deliveries;
    }

    public Long save(Delivery delivery) {
        entityManager.persist(delivery);
        return delivery.getId();
    }

}

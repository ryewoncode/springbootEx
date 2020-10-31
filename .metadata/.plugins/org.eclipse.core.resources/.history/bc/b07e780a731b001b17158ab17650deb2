package net.class101.homework1.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import net.class101.homework1.domain.Item;

public class JpaItemRepository implements ItemRepository {

    private final EntityManager em;

    public JpaItemRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Item save(Item item) {
        em.persist(item);
        return item;
    }

    @Override
    public Optional<Item> findByItemNo(String itemNo) {
        Item item = em.find(Item.class, itemNo);
        return Optional.ofNullable(item);
    }

    @Override
    public Optional<Item> findByKind(String kind) {
        return Optional.empty();
    }

    @Override
    public Optional<Item> findByName(String name) {
        List<Item> result = em.createQuery("select i from Items m where m.name = :name", Item.class)
                .setParameter("name", name).getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<Item> findAll() {
        return em.createQuery("select i from Items i", Item.class).getResultList();
    }
}
package net.class101.homework1.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.class101.homework1.domain.Item;

public interface SpringDataJpaItemRepository extends JpaRepository<Item, String>, ItemRepository {
    @Override
    Optional<Item> findByName(String name);

    @Override
    List<Item> findAll();
}
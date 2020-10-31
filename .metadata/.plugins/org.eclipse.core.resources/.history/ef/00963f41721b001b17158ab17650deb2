package net.class101.homework1.repository;

import java.util.List;
import java.util.Optional;

import net.class101.homework1.domain.Item;

public interface ItemRepository {
    Item save(Item item);

    Optional<Item> findByItemNo(String itemNo);

    Optional<Item> findByKind(String kind);

    Optional<Item> findByName(String name);

    List<Item> findAll();
}
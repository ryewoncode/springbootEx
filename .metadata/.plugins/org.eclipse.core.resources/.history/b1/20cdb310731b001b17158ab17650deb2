package net.class101.homework1.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import net.class101.homework1.domain.Item;

public class MemoryItemRepository implements ItemRepository {
    private static Map<String, Item> store = new HashMap<>();

    @Override
    public Item save(Item item) {
        store.put(item.getItemNo(), item);
        return item;
    }

    @Override
    public Optional<Item> findByItemNo(String itemNo) {
        return Optional.ofNullable(store.get(itemNo));
    }

    @Override
    public Optional<Item> findByKind(String kind) {
        return null;
    }

    @Override
    public Optional<Item> findByName(String name) {
        return store.values().stream().filter(item -> item.getName().equals(name)).findAny();
    }

    @Override
    public List<Item> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}

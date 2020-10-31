package net.class101.homework1.service;

// import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.class101.homework1.repository.ItemRepository;
// import net.class101.homework1.repository.MemoryItemRepository;

@Configuration
public class SpringConfig {
    // private final ItemRepository itemRepository;

    // @Autowired
    // public SpringConfig(ItemRepository itemRepository) {
    // this.itemRepository = itemRepository;
    // }

    // @Bean
    // public ItemService itemService() {
    // return new ItemService(itemRepository);
    // }

    // @Bean
    // public ItemRepository itemRepository() {
    // return new MemoryItemRepository();
    // }
}

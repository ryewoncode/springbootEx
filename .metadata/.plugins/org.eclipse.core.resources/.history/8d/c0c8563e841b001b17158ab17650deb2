package net.class101.homework1.repository;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import net.class101.homework1.domain.Item;

class MemoryItemRepositoryTest {
    MemoryItemRepository repository = new MemoryItemRepository();

    @AfterEach
    public void AfterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Item item = new Item();
        item.setItemNo("16374");
        item.setKind("KLASS");
        item.setName("스마트스토어로 월 100만원 만들기, 평범한 사람이 돈을 만드는 비법");
        item.setPrice(151950);
        item.setStock(99999);

        repository.save(item);

        Item result = repository.findByItemNo(item.getItemNo()).get();
        Assertions.assertThat(item).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Item item1 = new Item();
        item1.setItemNo("26825");
        item1.setName("해금, 특별하고 아름다운 나만의 반려악기");
        repository.save(item1);

        Item item2 = new Item();
        item2.setItemNo("65625");
        item2.setName("일상에 따뜻한 숨결을 불어넣어요, 반지수와 함께하는 아이패드 드로잉");
        repository.save(item2);

        Item result = repository.findByName("해금, 특별하고 아름다운 나만의 반려악기").get();

        Assertions.assertThat(result).isEqualTo(item1);
    }

    @Test
    public void findAll() {
        Item item1 = new Item();
        item1.setItemNo("26825");
        item1.setName("해금, 특별하고 아름다운 나만의 반려악기");
        repository.save(item1);

        Item item2 = new Item();
        item2.setItemNo("65625");
        item2.setName("일상에 따뜻한 숨결을 불어넣어요, 반지수와 함께하는 아이패드 드로잉");
        repository.save(item2);

        List<Item> result = repository.findAll();

        Assertions.assertThat(result.size()).isEqualTo(2);
    }
}

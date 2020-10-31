package net.class101.homework1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.class101.homework1.domain.Item;
import net.class101.homework1.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
    private ItemRepository itemRepository;

    /**
     * 상품 데이터 입력o
     */
    public String inputItem(Item item) {

        validateDuplicateItemNo(item); // 중복 상품번호 검증
        itemRepository.save(item);
        return item.getItemNo();
    }

    private void validateDuplicateItemNo(Item item) {
		/*
		 * itemRepository.findByItemNo(item.getItemNo()).ifPresent(i -> { throw new
		 * IllegalStateException("이미 존재하는 상품번호 입니다."); });
		 */
    }

    /**
     * 전체 상품 조회
     */
    public List<Item> findItems() {
    	System.out.println("33333333");
		List<Item> items = new ArrayList<>();
		itemRepository.findAll().forEach(e -> items.add(e));
		
		System.out.println(items);
		return items;
    }
    

	/*
	 * public Optional<Item> findOne(String itemNo) { return
	 * itemRepository.findByItemNo(itemNo); }
	 */
}

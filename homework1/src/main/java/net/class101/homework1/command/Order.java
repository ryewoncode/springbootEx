package net.class101.homework1.command;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.class101.homework1.domain.Item;
import net.class101.homework1.service.ItemService;

public class Order {
	@Autowired
    ItemService itemService;

    public void showItemList() {
        System.out.println("2222");

        List<Item> rsItem = itemService.findItems();

        if (!rsItem.isEmpty()) {

            for (Item items : rsItem) {
                System.out.println(items.getItemNo() + ", " + items.getKind() + ", " + items.getName() + ", "
                        + items.getPrice() + ", " + items.getStock());
            }

        }
    }

}

package net.class101.homework1.command;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.class101.homework1.domain.Item;
import net.class101.homework1.service.ItemService;

public class Order {
    @Autowired
    ItemService itemService;

    public void introOrder() {
        System.out.println("입력(o[order]: 주문, q[quit]: 종료):");
    }

    public void showItemList() {
        System.out.println("1111");
        List<Item> rsItem = itemService.findItems();
        for (Item items : rsItem) {
            System.out.println(items.getItemNo() + ", " + items.getKind() + ", " + items.getName() + ", "
                    + items.getPrice() + ", " + items.getStock());
        }
        System.out.println("2222");
    }

}

class IntroOrderCommand implements ICommand {
    private Order _order;

    public IntroOrderCommand(Order order) {
        _order = order;
    }

    public void execute() {
        _order.introOrder();
    }
}

class ShowItemListCommand implements ICommand {
    private Order _order;

    public ShowItemListCommand(Order order) {
        _order = order;
    }

    public void execute() {
        _order.showItemList();
    }
}
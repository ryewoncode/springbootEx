package net.class101.homework1.command;


public class ShowItemListCommand implements ICommand {
    private Order _order;

    public ShowItemListCommand() {

    }

    public ShowItemListCommand(Order order) {
        _order = order;
    }

    public void execute() {
        _order.showItemList();
    }
}
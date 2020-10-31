package net.class101.homework1.command;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.class101.homework1.service.ItemService;

@SpringBootApplication
public class Client {
    ItemService itemService;

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);

        System.out.println("헬로헬로");
        Order order = new Order();
        ICommand introOrderCommand = new IntroOrderCommand(order);
        ICommand showItemListCommand = new ShowItemListCommand(order);
        Scanner sc = new Scanner(System.in);

        Invoker introInvoker = new Invoker(introOrderCommand);
        introInvoker.run();
        String option = sc.next();
        sc.close();

        if (option.equals("o") || option.equals("O")) {
            Invoker showInvoker = new Invoker(showItemListCommand);
            showInvoker.run();
        } else if (option.equals("q") || option.equals("Q")) {

        } else {

        }
    }

}
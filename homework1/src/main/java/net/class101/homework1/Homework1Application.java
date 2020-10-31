package net.class101.homework1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.class101.homework1.command.ICommand;
import net.class101.homework1.command.Invoker;
import net.class101.homework1.command.Order;

// import net.class101.homework1.command.ICommand;
// import net.class101.homework1.command.IntroOrderCommand;
// import net.class101.homework1.command.Invoker;
// import net.class101.homework1.command.Order;
// import net.class101.homework1.service.ItemService;

@SpringBootApplication
public class Homework1Application {
	// ItemService itemService;

	public static void main(String[] args) {
		SpringApplication.run(Homework1Application.class, args);

		Order order = new Order();

		System.out.println("입력(o[order]: 주문, q[quit]: 종료):");
		Scanner sc = new Scanner(System.in);

		String option = sc.next();

		if (option.equals("o") || option.equals("O")) {
			order.showItemList();
		} else if (option.equals("q") || option.equals("Q")) {

		} else {

		}
		sc.close();

	}

}
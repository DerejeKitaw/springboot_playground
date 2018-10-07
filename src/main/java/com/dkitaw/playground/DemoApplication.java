package com.dkitaw.playground;

import com.dkitaw.playground.demo_one.Book;
import com.dkitaw.playground.demo_one.MyBean;
import com.dkitaw.playground.demo_one.Person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// ConfigurableApplicationContext context =SpringApplication.run(DemoApplication.class, args);

		// Book loveOnly = context.getBean(Book.class);
		// loveOnly.print();

		// MyBean mybean = context.getBean(MyBean.class);
		
	}
}

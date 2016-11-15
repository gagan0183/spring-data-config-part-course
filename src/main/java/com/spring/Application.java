package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.PageRequest;

import com.spring.data.Book;
import com.spring.data.BookRepository;

public class Application {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"application-context.xml")) {
			BookRepository bookRepository = applicationContext.getBean(BookRepository.class);
			for (Book b : bookRepository.queryOne(new PageRequest(0, 5))) {
				System.out.println(b);
			}
		}
	}
}

package com.spring;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.data.Book;
import com.spring.data.BookRepository;

@SpringBootApplication
public class SpringDataDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataDemoApplication.class, args);
		BookRepository bookRepository = context.getBean(BookRepository.class);
		Book book = new Book();
		book.setTitle("spring");
		book.setPageCount(99);
		book.setPublishDate(new Date());

		bookRepository.save(book);
	}
}

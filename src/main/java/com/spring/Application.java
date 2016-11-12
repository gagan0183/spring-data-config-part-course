package com.spring;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.data.Book;
import com.spring.data.BookService;

public class Application {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"application-context.xml")) {
			BookService bookService = applicationContext.getBean(BookService.class);

			Book book = new Book();
			book.setTitle("book 1");
			book.setPublishDate(new Date());
			book.setPageCount(99);
			book.setPrice(new BigDecimal(9));

			bookService.save(book);
		}
	}
}

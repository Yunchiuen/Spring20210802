package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 使用這個一定只能有一個bean,應為如果有兩個會不知道抓那個會出現錯誤
		// Author author1=ctx.getBean(Author.class);
		// 反轉控制 IOC
		Author author1 = (Author) ctx.getBean("author1");
		System.out.println(author1);
		Author author2 = (Author) ctx.getBean("author2");
		System.out.println(author2);
		Author author3 = (Author) ctx.getBean("author3");
		System.out.println(author3);
		Author author4 = (Author) ctx.getBean("author4");
		System.out.println(author4);

		Book book1 = (Book) ctx.getBean("book1");
		System.out.println(book1);
		Book book2 = (Book) ctx.getBean("book2");
		System.out.println(book2);
		Book book3 = (Book) ctx.getBean("book3");
		System.out.println(book3);
		Book book4 = (Book) ctx.getBean("book4");
		System.out.println(book4);

	}

}

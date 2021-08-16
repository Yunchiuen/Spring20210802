package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Husband husband = (Husband) ctx.getBean("husband");
		Wife wife = (Wife) ctx.getBean("wife");

		System.out.println(husband);
		System.out.println(wife);

		System.out.printf("%s 的老婆是 %s\n", husband.getName(), husband.getWife().getName());
		System.out.printf("%s 的丈夫是 %s\n", wife.getName(), wife.getHusband().getName());

		Husband husband2 = (Husband) ctx.getBean("husband2");
		Wife wife2 = (Wife) ctx.getBean("wife2");

		
	}
}

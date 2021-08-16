package com.study.spring.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		//使用 scope="singleton" 不用getBean bean會自行掃一遍做建立
		//會先呼叫空參數建構子再來init()
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//使用 scope="prototype" 3個物件各自獨立,每個人使用都會new一個新的物件,記憶體位置都有所不同
		Student s1=(Student) ctx.getBean("student1");
		Student s2=(Student) ctx.getBean("student1");
		Student s3=(Student) ctx.getBean("student1");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//必須要使用 scope="singleton" 才會出現destroy
		((ClassPathXmlApplicationContext)ctx).close();
		
	}

}

package com.study.spring.case05.proxy.dyn;

import com.study.spring.case05.proxy.sta.Man;
import com.study.spring.case05.proxy.sta.Person;

public class TestPerson {
	public static void main(String[] args) {
		Person p1  =(Person) new ProxyUtil(new Man()).getProxy();
		p1.work();
	}
}

package com.study.spring.case05.proxy.sta;

//靜態代理
public class PersonProxy implements Person {
	private Person person;

	public PersonProxy(Person person) {
		this.person = person;
	}

	@Override
	public void work() {
		// 公用方法
		System.out.println("戴口罩");
		// 代理調用業務方法
		try {
			person.work();
		} catch (Exception e) {
			// 例外公用方法
			System.out.println("買口罩");
		}

		// 公用方法
		System.out.println("脫口罩");
	}

}

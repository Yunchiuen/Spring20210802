package com.study.spring.case01;

public class Husband {
	private String name;
	private Wife wife;
	
	public Husband() {
		super();
	}
	public Husband(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}

	
}

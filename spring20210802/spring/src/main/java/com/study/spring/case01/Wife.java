package com.study.spring.case01;

public class Wife {
	private String name;
	private Husband husband;
	public Wife() {
		super();
	}

	public Wife(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}

}

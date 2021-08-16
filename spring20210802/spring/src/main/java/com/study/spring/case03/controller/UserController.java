package com.study.spring.case03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.case03.service.UserService;
import com.study.spring.case03.service.UserServiceImpl;

@Controller
public class UserController {

	private UserService userservice = new UserServiceImpl();
	
	//自動裝配順序 byType在進行byName
	//@Autowired
	//private UserService userservice;
	
	public UserController() {
		System.out.println("UserController()");
	}

	public void appendUser() {
		userservice.addUser();
	}
}

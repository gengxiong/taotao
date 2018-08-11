package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.TbUser;
import com.taotao.service.TestUserService;

@Controller
public class TestUser {
	@Autowired
	private TestUserService testUserService;
	
	@RequestMapping(value="/test")
	@ResponseBody
	public TbUser testUser(int id){
		TbUser tbUser=testUserService.testSelectUser(7);
		System.out.println("111");
		System.out.println(tbUser);
		return tbUser;
	}
	@RequestMapping(value="/t")
	public String User(){
		
		System.out.println("1112");

		return "111";
	}


}

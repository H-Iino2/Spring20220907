package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.DBService;

@Controller
public class DBcontroller {
	@Autowired
	private  DBService service; 
	
	@RequestMapping(value = "/select")
	public String selectItem(Model model) {
		System.out.println(service.select());
		return "dbtest";
	}
	
	
	@RequestMapping(value = "/db")
	public String dbtest(Model model) {
		return "dbtest";
	}
	
	@RequestMapping(value = "/db", method = RequestMethod.POST)
	public String dbinsert(@RequestParam("test") String test, Model model ) {
		service.insert(test);
		
		return "dbtest";
	}
	
	
	
	
	
	
}

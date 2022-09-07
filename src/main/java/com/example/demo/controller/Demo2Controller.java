package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.CatModel;
import com.example.demo.service.DemoService;

@Controller
public class Demo2Controller {
	
	@Autowired DemoService Serv;
	
	@RequestMapping("/")
	public String top(Model model) {
		return "top";
	}
	
	@RequestMapping("/test")
	public String test(Model model) {
		CatModel cat = new CatModel();
		cat.setCall("にゃー"); 
		System.out.println(cat.getCall());
		return "top";
	}
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST )
	public ModelAndView send(@RequestParam("q1")String q1,ModelAndView mav) {
		
		
		if (q1.equals("maru")) {
			mav.addObject("result", "正解");
		}else{
			mav.addObject("result","不正解");
		}
		
		mav.setViewName("top");
		return mav;
	}
	
	
	

}

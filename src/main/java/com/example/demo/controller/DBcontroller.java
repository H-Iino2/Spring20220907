package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.DBModel;
import com.example.demo.service.DBService;

@Controller
public class DBcontroller {
	@Autowired
	private  DBService service; 
	
	
	@RequestMapping(value = "/update/{id}" ,method = RequestMethod.GET)
	public String updateItem(Model model, @PathVariable("id") int id) {
		
		List<DBModel> list = service.selectUpdateItem(id);
		System.out.println(list.get(0).getTest());
		
		model.addAttribute("lists", list);
		return "dbtestUpdate";
	}
	
	@RequestMapping(value = "/updateItem", method = RequestMethod.POST)
	public String updateItem(Model model, 
			@RequestParam ("id") int id,@RequestParam ("test") String test,@RequestParam("kazu") int kazu)
	{
		 List<DBModel> list = service.updateItem(id,test,kazu);
		model.addAttribute("lists",list);
		return "dbtest";
	}
	
	
	
	@RequestMapping (value = "/delete/{id}" ,method = RequestMethod.POST)
	public String deleteItem(Model model, @PathVariable("id") int id ) {

		service.deleteItem(id);
		
		List<DBModel> list =  service.selectItem();
		model.addAttribute("lists", list);
		
		return "dbtest";
	}
	
	
	@RequestMapping(value = "/select")
	public String selectItem(Model model) {

		List<DBModel> list =  service.selectItem();
		System.out.println(service.selectOneItem());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId());
		}
		model.addAttribute("lists", list);
		
		return "dbtest";
	}
	
	
	@RequestMapping(value = "/db")
	public String dbtest(Model model) {
		
		List<DBModel> list =  service.selectItem();
		model.addAttribute("lists", list);
		return "dbtest";
	}
	
	@RequestMapping(value = "/db", method = RequestMethod.POST)
	public String dbinsert(@RequestParam("test") String test, Model model ) {
		service.insert(test);
		
		List<DBModel> list =  service.selectItem();
		model.addAttribute("lists", list);
		return "dbtest";
	}
	

	
	
	
	
	
}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Demo2dao;

@Service
public class DBService {
	@Autowired
	private  Demo2dao dao;
	
	public void insert(String test) {
		dao.insertItem(test);
		System.out.println(test);
	}
	
	public String select() {
		String select = dao.selectItem();
		return select;
	}
	
}

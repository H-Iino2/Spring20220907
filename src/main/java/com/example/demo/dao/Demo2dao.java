package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.DemoMapper;

@Repository
public class Demo2dao {
	@Autowired
	private DemoMapper mapper; 
	
	public boolean insertItem(String test) {
		return mapper.insertItem(test);
	}
	
	public String selectItem() {
		return mapper.selectItem();
	}

}

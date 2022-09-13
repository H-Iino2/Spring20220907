package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.model.DBModel;

@Repository
public class Demo2dao {
	@Autowired
	private DemoMapper mapper; 
	
	public boolean insertItem(String test) {
		return mapper.insertItem(test);
	}
	
	public String selectOneItem() {
		return mapper.selectOneItem();
	}
	
	public List<DBModel> selectItem() {
		System.out.println("daooooooooooooooooooooooooooooooooo");
		System.out.println(mapper.selectItem().get(0).getTest());
		return mapper.selectItem();
	}
	
	
	public boolean deleteItem(int id) {
		return mapper.deleteItem(id);
	}
	
	public void updateItem(int id,String test, int kazu){
		mapper.updateItem(id,test,kazu);
	}
	
	public List<DBModel> selectUpdateItem(int id){
		return mapper.selectUpdateItem(id);
	}

}

package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Demo2dao;
import com.example.demo.model.DBModel;

@Service
public class DBService {
	@Autowired
	private  Demo2dao dao;
	
	public List<DBModel> updateItem(int id, String test, int kazu){
		dao.updateItem(id, test, kazu);
		//List<DBModel> updateItem = dao.selectUpdateItem(id);
		List<DBModel> DBList = dao.selectItem();
		return DBList;
	}
	
	public List<DBModel> selectUpdateItem(int id){
		
		List<DBModel> updateItem = dao.selectUpdateItem(id);
		return updateItem;
	}
	
	public void insert(String test) {
		dao.insertItem(test);
		System.out.println(test);
	}
	
	public String selectOneItem() {
		String select = dao.selectOneItem();
		return select;
	}
	
	public List<DBModel> selectItem() {
		
		//List<DBModel> DBList = new ArrayList<DBModel>();
		
		//DBModel DBList = dao.selectItem();
		List<DBModel> DBList = dao.selectItem();
		
		//String select2 = dao.selectItem();
		return DBList;
	}
	
	public void deleteItem(int id) {
		dao.deleteItem(id);
	}
	
	
	
	
	
}

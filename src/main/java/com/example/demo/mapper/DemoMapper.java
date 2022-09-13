package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.DBModel;

@Mapper
public interface DemoMapper {
	
	String selectOneItem();
	
	List<DBModel> selectItem();
	
	boolean insertItem(String test);
	
	boolean deleteItem(int id);
	
	List<DBModel> selectUpdateItem(int id);
	
	boolean updateItem(int id,String test, int kazu);
	
	
	
}

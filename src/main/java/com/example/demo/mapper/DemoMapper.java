package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper {
	
	String selectItem();
	
	boolean insertItem(String test);
	
	
	
}

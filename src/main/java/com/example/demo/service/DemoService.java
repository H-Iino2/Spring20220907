package com.example.demo.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	
	String [] quiz = {"出身", "好きな食べ物", "誕生日"};
	int [] useNum = new int[3];
	
	
	
	public int randNum() {
		Random rnd = new Random();
		int randNum = rnd.nextInt(2);
		return randNum;
	}
	
	public int[] useNum() {
		int [] useNum = new int[3];
		for (int i = 0; i<2; i++) {
			int targetNum = randNum();
			useNum[i] = targetNum;
		}
		return useNum;
	}
	
	public String[] quiz(int i) {	
		int[] useNum = useNum();
		String quizUse = quiz[i];  
		
		return quizUse[0];
	}
	
}


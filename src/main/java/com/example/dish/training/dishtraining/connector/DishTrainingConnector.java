package com.example.dish.training.dishtraining.connector;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DishTrainingConnector {
	
	private List<String> list;
	
	public DishTrainingConnector(List<String> list) {
		this.list = list;
	}
	
	public List<String> getEmployeeList(){
		
		list = new ArrayList<String>();
		list.add("John");
		list.add("Gartner");
		list.add("Peter");
		list.add("Mayhem");
		list.add("McClain");
		
		return list;
	}

}

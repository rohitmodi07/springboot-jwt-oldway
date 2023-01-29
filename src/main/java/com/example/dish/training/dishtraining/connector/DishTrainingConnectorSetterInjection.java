package com.example.dish.training.dishtraining.connector;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DishTrainingConnectorSetterInjection {
	
	private List<String> list;
	
	public DishTrainingConnectorSetterInjection(List<String> list) {
		this.list = list;
	}
	
	public List<String> getEmployeeList(){
		
		list = new ArrayList<String>();
		list.add("Rami");
		list.add("Bethal");
		list.add("Martin");
		list.add("Jen");
		list.add("Perla");
		
		return list;
	}

}

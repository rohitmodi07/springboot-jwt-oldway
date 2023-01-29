package com.example.dish.training.dishtraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.dish.training.dishtraining.connector.DishTrainingConnector;

@Component
public class DishTrainingService {
	
	@Autowired
	private DishTrainingConnector dishTrainingConnector;
	
	public DishTrainingService(DishTrainingConnector dishTrainingConnector){
		this.dishTrainingConnector = dishTrainingConnector;
	}
	
	public List<String> getValues() {
		return dishTrainingConnector.getEmployeeList();
	}

}

package com.example.dish.training.dishtraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.dish.training.dishtraining.connector.DishTrainingConnector;
import com.example.dish.training.dishtraining.connector.DishTrainingConnectorSetterInjection;

@Component
public class DishTrainingServiceSetterInjection {
	
	private DishTrainingConnectorSetterInjection dishTrainingConnector;
	
	public List<String> getValues() {
		return dishTrainingConnector.getEmployeeList();
	}
	
	@Autowired
	public void setDishTrainingConnectorSetterInjection(DishTrainingConnectorSetterInjection dishTrainingConnector) {
		this.dishTrainingConnector = dishTrainingConnector;
	}
	
}

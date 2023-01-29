package com.example.dish.training.dishtraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dish.training.dishtraining.connector.DishTrainingConnectorSetterInjection;
import com.example.dish.training.dishtraining.service.DishTrainingService;
import com.example.dish.training.dishtraining.service.DishTrainingServiceSetterInjection;

@RestController
public class DishTrainingSetterController {
	
	private DishTrainingServiceSetterInjection setterService;
	
	@Autowired
	public void setDishTrainingConnectorSetterInjection(DishTrainingServiceSetterInjection setterService) {
		System.out.println(" constructor with arguement");
		this.setterService = setterService;
	}
	
	@GetMapping("/dishsetter")
	public List<String> displaySetter() {
		return setterService.getValues();
	}

}

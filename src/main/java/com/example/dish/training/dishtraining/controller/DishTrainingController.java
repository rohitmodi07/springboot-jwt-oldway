package com.example.dish.training.dishtraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dish.training.dishtraining.connector.DishTrainingConnectorSetterInjection;
import com.example.dish.training.dishtraining.service.DishTrainingService;
import com.example.dish.training.dishtraining.service.DishTrainingServiceSetterInjection;

@RestController
public class DishTrainingController {
	
	@Autowired
	private DishTrainingService service;
	
	public DishTrainingController(DishTrainingService service) {
		this.service = service;
	}
	
	@GetMapping("/dish")
	public List<String> display() {
		return service.getValues();
	}

}

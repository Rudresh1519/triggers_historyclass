package com.java.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.java.api.entity.Cars;
import com.java.api.repository.CarRepository;

@Component
public class CarService {

	@Autowired
	private CarRepository carsRepository;
	
	public List<Cars> getAllCar()
	{
		return (List<Cars>) carsRepository.findAll();
	}
	
	public Optional<Cars> getCar(String carType) 
	{
		return carsRepository.findById(carType);
	}
	
	public void addCar(Cars cars)
	{
		carsRepository.save(cars);
	}
	
	public void updateCar(String carType, Cars cars)
	{
		carsRepository.save(cars);
	}
	
	public void deleteCar(String carType)
	{
		carsRepository.deleteById(carType);
	}
}

package com.example.demo.service;

import com.example.demo.dao.entities.Car;
import com.example.demo.dao.repositories.CarRepository;
import com.example.demo.dto.CarDTO;
import com.example.demo.mapper.CarMapper;

import java.util.List;

public class CarManager implements CarService {
    private CarRepository carRepository;
    private CarMapper carMapper;
    @Override
    public CarDTO saveAvion(CarDTO carDTO) {
        Car car = carMapper.fromCarDTO(carDTO);
        return null;
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        return List.of();
    }
}

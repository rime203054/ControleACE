package com.example.demo.service;

import com.example.demo.dto.CarDTO;

import java.util.List;

public interface CarService {
    public CarDTO saveAvion(CarDTO carDTO);
    public List<CarDTO> getCarByModel(String model);
}

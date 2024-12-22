package com.example.demo.mapper;

import com.example.demo.dao.entities.Car;
import com.example.demo.dto.CarDTO;
import org.modelmapper.ModelMapper;


public class CarMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Car fromBookDtoToBook(CarDTO carDTO){
        return mapper.map(carDTO,  Car.class);
    }
    public CarDTO fromAvionToAvionDto(Car car){
        return mapper.map(car, CarDTO.class);
    }

    public Car fromCarDTO(CarDTO carDTO) {
        return null;
    }
}

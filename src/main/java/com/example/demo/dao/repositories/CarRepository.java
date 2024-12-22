package com.example.demo.dao.repositories;

import com.example.demo.dao.entities.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}

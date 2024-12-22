package com.example.demo.web;

import com.example.demo.dto.CarDTO;
import com.example.demo.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CarGraphQLController {
   protected CarService carService;

   @MutationMapping
   public CarDTO saveAvion(@Argument CarDTO Car){
      return carService.saveAvion(Car);
   }
   @QueryMapping
   public List<CarDTO> getCarByModel(@Argument String model){
      return carService.getCarByModel(model);
   }

}

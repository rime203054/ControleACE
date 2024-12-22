package com.example.demo.dto;

import lombok.*;

import java.util.Date;

 @AllArgsConstructor @NoArgsConstructor @Builder @Getter
 @Setter @ToString
public class CarDTO {
     private String model;
     private String color;
     private Long price;
     private Long Matricul;

}

package com.example.RestaurantModel.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    private Integer restroId;
    private String restroName;
    private Integer restroStaff;
    private String restroSpecialty;
    private String restroContact;
    private String restroAddress;
    private Integer restroDiscount;


}
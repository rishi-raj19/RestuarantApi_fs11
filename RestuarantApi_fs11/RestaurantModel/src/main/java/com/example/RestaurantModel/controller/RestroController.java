package com.example.RestaurantModel.controller;

import com.example.RestaurantModel.model.Restaurant;
import com.example.RestaurantModel.service.RestroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestroController {

    @Autowired
    RestroService restroService;

    @GetMapping(value = "Restro")
    public List<Restaurant> getAllRestaurant()
    {
        return restroService.getAllRestro();
    }

    @GetMapping("Restro/search/{restroId}")
    public Restaurant getRestroByRestroId(@PathVariable Integer restroId){
        return restroService.getRestroById(restroId);
    }

    @PostMapping("Restro")
    public String addRestro(@RequestBody Restaurant restro)
    {
        return restroService.createRestro(restro);
    }

    @DeleteMapping("Restro/delete/{restroId}")

    public String DeleteRestroById (@PathVariable Integer restroId ){

        return restroService.DeleteRestro(restroId);
    }

    @PutMapping("Restro/{restroId}/Specialty/{restroSpecialty}")
    public String UpdateRestro(@PathVariable Integer restroId,@PathVariable String restroSpecialty)
    {
        return restroService.updateRestroSpecialty(restroId,restroSpecialty);
    }
}
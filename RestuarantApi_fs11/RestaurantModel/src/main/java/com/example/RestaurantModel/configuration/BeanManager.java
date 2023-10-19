package com.example.RestaurantModel.configuration;

import com.example.RestaurantModel.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.List;

@Configuration
class BeanManager {

    @Bean
    public List<Restaurant> getInitializedList()
    {
        Restaurant initUser = new Restaurant(4,"Bawarchi",10,"Indian","9905579144","Dimna",12);
        List<Restaurant> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }

}
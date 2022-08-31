package com.northsea.service;

import com.northsea.config.SpringConfig;
import com.northsea.domain.Dish;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class DishServiceTest {

    @Autowired
    private DishService dishService;

    @Test
    public void getByIdTest(){
        Dish dish = dishService.getById(1);
        System.out.println(dish);
    }

    @Test
    public void getAllTest(){
        List<Dish> dish = dishService.getAll();
        System.out.println(dish);
    }
}

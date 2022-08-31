package com.northsea.controller;

import com.northsea.domain.Dish;
import com.northsea.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dishes")    //页面访问路径
public class DishController {
    @Autowired
    private DishService dishService;

    @PostMapping
    public boolean add(@RequestBody Dish dish){
        return dishService.add(dish);
    }

    @PutMapping
    public boolean update(@RequestBody Dish dish){
        return dishService.update(dish);
    }

    @DeleteMapping
    public boolean delete(@PathVariable Integer id){
        return dishService.delete(id);
    }

    @GetMapping
    public Dish getById(@PathVariable Integer id){
        return dishService.getById(id);
    }

    @GetMapping
    public List<Dish> getAll(){
        return dishService.getAll();
    }
}

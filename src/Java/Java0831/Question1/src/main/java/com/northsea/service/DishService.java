package com.northsea.service;

import com.northsea.domain.Dish;

import java.util.List;

public interface DishService {
    //add new dish
    public boolean add(Dish dish);

    //update dish
    public boolean update(Dish dish);

    //delete by id
    public boolean delete(Integer id);

    //select by id
    public Dish getById(Integer id);

    //select All
    public List<Dish> getAll();
}

package com.northsea.service.impl;

import com.northsea.dao.OrderDAO;
import com.northsea.domain.Dish;
import com.northsea.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishServiceImpl implements DishService {
    @Autowired
    private OrderDAO orderDAO;

    @Override
    public boolean add(Dish dish) {
        orderDAO.save(dish);
        return true;
    }

    @Override
    public boolean update(Dish dish) {
        orderDAO.update(dish);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        orderDAO.delete(id);
        return true;
    }

    @Override
    public Dish getById(Integer id) {
        return orderDAO.getById(id);
    }

    @Override
    public List<Dish> getAll() {
        return orderDAO.getAll();
    }
}

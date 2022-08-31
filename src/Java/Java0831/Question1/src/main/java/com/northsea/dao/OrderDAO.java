package com.northsea.dao;

import com.northsea.domain.Dish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface OrderDAO {
    @Insert("insert into dish_table (name, price, description) values(#{name). #{price}, #{description}")
    public void save(Dish dish);

    @Update("update dish_table set name = #{name}, price = #{price}, description = #{description} where id = #{id}")
    public void update(Dish dish);

    @Delete("delete from dish_table where id = #{id}")
    public void delete(Integer id);

    @Select("select * from dish_table where id = #{id}")
    public Dish getById(Integer id);

    @Select("select * from dish_table")
    public List<Dish> getAll();
}

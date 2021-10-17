package com.basicspringboot.springbootrestAPI.repositories;

import com.basicspringboot.springbootrestAPI.domain.Category;
import com.basicspringboot.springbootrestAPI.exceptions.EtBadRequestException;
import com.basicspringboot.springbootrestAPI.exceptions.EtResourceNotFoundException;
import com.basicspringboot.springbootrestAPI.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Category> findAll(Integer userId) throws EtResourceNotFoundException {
        return null;
    }

    @Override
    public Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
        return null;
    }

    @Override
    public Integer create(Integer userId, String title, String description) throws EtBadRequestException {
        return null;
    }

    @Override
    public void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException {

    }

    @Override
    public void removeById(Integer userId, Integer categoryId) {

    }
}

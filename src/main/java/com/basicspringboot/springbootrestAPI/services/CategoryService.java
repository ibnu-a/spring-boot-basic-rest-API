package com.basicspringboot.springbootrestAPI.services;

import com.basicspringboot.springbootrestAPI.domain.Category;
import com.basicspringboot.springbootrestAPI.exceptions.EtBadRequestException;
import com.basicspringboot.springbootrestAPI.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}

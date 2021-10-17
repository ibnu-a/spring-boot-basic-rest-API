package com.basicspringboot.springbootrestAPI.repositories;

import com.basicspringboot.springbootrestAPI.domain.User;
import com.basicspringboot.springbootrestAPI.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findEmailAndPassword(String email, String password);

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}

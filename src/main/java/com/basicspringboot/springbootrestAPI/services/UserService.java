package com.basicspringboot.springbootrestAPI.services;

import com.basicspringboot.springbootrestAPI.domain.User;
import com.basicspringboot.springbootrestAPI.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}

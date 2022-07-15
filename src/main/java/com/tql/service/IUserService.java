package com.tql.service;


import com.tql.entities.User;

public interface IUserService  {
    User findByUsername(String username);
}

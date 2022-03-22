package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {


    void addUser(List<User> list, User user);

    void findById(List<User> list, int id);

    void deleteById(List<User> list, int id);

    void getAllUsers(List<User> list);
}





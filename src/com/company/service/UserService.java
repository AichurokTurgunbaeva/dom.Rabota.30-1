package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    User getById (int id);

    void deleteById(int id);

    List<User> getAll();
}





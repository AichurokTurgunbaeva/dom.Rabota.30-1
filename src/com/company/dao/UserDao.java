package com.company.dao;

import com.company.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    User getById (int id);

    void deleteById(int id);

    List<User> getAll();
}

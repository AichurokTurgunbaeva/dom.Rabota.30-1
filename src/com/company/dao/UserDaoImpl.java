package com.company.dao;

import com.company.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao{

    Map<Integer, User> dao = new HashMap<>();

    @Override
    public void saveUser(User user) {
        dao.put(user.getId(),user);
    }

    @Override
    public User getById(int id) {
        return dao.get(id);
    }

    @Override
    public void deleteById(int id) {
        dao.remove(id);
    }

    @Override
    public List<User> getAll() {
        List<User> users = dao.values().stream().toList();
        return users;
    }
}

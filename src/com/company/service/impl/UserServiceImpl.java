package com.company.service.impl;

import com.company.InvalidIdException;
import com.company.dao.UserDao;
import com.company.dao.UserDaoImpl;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;
import java.util.Objects;


public class UserServiceImpl implements UserService {

    UserDao dao = new UserDaoImpl();

    @Override
    public void saveUser(User user) {
        User user1 = new User();
        String name = user.getName();

        if (Objects.equals(user1,name)){
            throw new RuntimeException();
        }
        dao.saveUser(user);
    }

    @Override
    public User getById(int id) {
        return dao.getById(id);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        return dao.getAll();
    }
}





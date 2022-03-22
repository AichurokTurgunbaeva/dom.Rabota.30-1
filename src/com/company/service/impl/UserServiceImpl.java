package com.company.service.impl;

import com.company.InvalidIdException;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;


public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao user) {
        this.userDao = user;
    }

    public UserDao getUser() {
        return userDao;
    }



    @Override
    public void addUser(List<User> list, User user) {
        list.add(user);
    }

    @Override
    public void findById(List<User> list, int id) {
        try {
            for (User user1 : list) {
                if (user1.getId() != id) {
                    throw new InvalidIdException(" no such id ");
                } else if(user1.getId() == id) {
                }
            }
        } catch (InvalidIdException e){
        }
    }

    private boolean user(int id) {
        return false;
    }

    @Override
    public void deleteById(List<User> list, int id) {
        list.removeIf(user1 -> user1.getId() == id);

    }

    @Override
    public void getAllUsers(List<User> list) {
        for (User user1 : list) {
            System.out.println(user1);
        }
    }
}





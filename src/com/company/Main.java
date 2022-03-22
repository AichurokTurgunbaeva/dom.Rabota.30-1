package com.company;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.Gender;
import com.company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>(List.of(new User(1, "Aichurok", 28, Gender.FEMALE),
                new User(2, "Ahmad", 5, Gender.MALE),
                new User(3, "Mariam", 4, Gender.FEMALE)));

            System.out.println("All users: ");
            users.stream().forEach(x -> System.out.println(x));
            UserDao userDao = new UserDao(users);
            UserServiceImpl userService = new UserServiceImpl(userDao);
            System.out.println("----------------------------------------------------");
            System.out.println("User with ID number-1: ");
            userService.findById(users, 1);

            for (User user1 : users) {
                if (user1.getId() == 1) {
                    System.out.println(user1);
                } else if (user1.getId() != 1) {
                    throw new InvalidIdException();
                }

            userService.deleteById(users, 2);
                System.out.println("----------------------------------------------------");
                System.out.println("All users after deleting the user with ID number-2: ");
            userService.getAllUsers(users);

        }
    }
}

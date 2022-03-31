package com.company;


import com.company.model.User;
import com.company.service.Gender;
import com.company.service.UserService;
import com.company.service.impl.UserServiceImpl;

import static com.company.service.Gender.FEMALE;
import static com.company.service.Gender.MALE;

public class Main {
     static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {

        User user1 = new User(1,"Aichurok",28,FEMALE);
        User user2 = new User(2,"Nurlan",24,MALE);
        User user3 = new User(3,"Aichurok",28,FEMALE);
        User user4 = new User(4,"Almaz",19,MALE);

        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);
        userService.saveUser(user4);

        userService.getAll().forEach(System.out::println);
        System.out.println();

        System.out.println(userService.getById(4));
        System.out.println();

        userService.deleteById(2);
        System.out.println();

        userService.getAll().forEach(System.out::println);

    }
}
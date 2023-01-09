package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> listUsers();

    User updateUser(User user);

    void deleteUser(Integer id);

    User showUser(Integer id);






}

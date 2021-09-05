package com.tsbookstore.springbootbookstore.service;

import com.tsbookstore.springbootbookstore.model.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}

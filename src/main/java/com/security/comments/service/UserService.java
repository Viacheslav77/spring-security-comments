package com.security.comments.service;

import org.springframework.security.core.userdetails.UserDetails;

import com.security.comments.model.User;

import java.util.List;

public interface UserService {
   
    User create(User user);

    User readById(long id);

    User update(User user);

    void delete(long id);

    List<User> getAll();

    UserDetails loadUserByUsername(String username);

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwetter.Dao;

import com.mycompany.kwetter.model.User;
//import java.security.Principal;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Pieter
 */
public class UserService
{
    @Inject
    TweetDAO daoTweet;

    @Inject
    UserDAO daoUser;

    //@Inject
    //Principal userPrincipal;

    public List<User> all() {
        return daoUser.list();
    }

    public void save(User user) 
    {
        daoUser.create(user);
    }

    public void remove(Long id)
    {
        User user = read(id);
        daoUser.delete(user);
    }

    public User read(Long id) 
    {
        User user = daoUser.read(id);
        if (user == null) {
            System.out.println("User not found. id = " + id);
        }
        return user;
    }
}

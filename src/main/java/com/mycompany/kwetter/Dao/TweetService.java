/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwetter.Dao;
import com.mycompany.kwetter.model.Tweet;
import com.mycompany.kwetter.model.User;
import java.io.Console;
//import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
/**
 *
 * @author Pieter
 */

@Stateless
public class TweetService {

    @Inject
    TweetDAO dao;

    @Inject
    UserDAO daoUser;

    //@Inject
    //Principal userPrincipal;

    public List<Tweet> all() {
        return dao.list();
    }

    public List<Tweet> allByUser(Long id)
    {
        User user = daoUser.read(id);
        if (user == null) 
        {
            System.out.println("User not found. id = " + id);
        }
        return dao.listByUser(user);
    }

    public void save(Tweet tweet) 
    {
        dao.create(tweet);
    }

    public void remove(Long id)
    {
        Tweet tweet = read(id);
        dao.delete(tweet);
    }

    public Tweet read(Long id) 
    {
        Tweet tweet = dao.read(id);
        if (tweet == null) {
            System.out.println("Tweet not found. id = " + id);
        }
        return tweet;
    }

}
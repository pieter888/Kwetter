/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwetter.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pieter
 */
@XmlRootElement
public class test
{
    
    private int id;
    
    private String name;

    public test()
    {
    }

    public test(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    
    
}
/*
package com.maartenschermer.kwetter.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Mention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long date;

    
    @NotNull
    @ManyToOne
    private User user;

    @NotNull
    @ManyToOne
    private Tweet tweet;

    public Mention() {

    }

    public Mention(User user, Tweet tweet) {
        this.user = user;
        this.tweet = tweet;
        this.date = System.nanoTime();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }

}

*/
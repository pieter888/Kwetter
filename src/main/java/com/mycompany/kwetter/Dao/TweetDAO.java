/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwetter.Dao;

/**
 *
 * @author Pieter
 */
import com.mycompany.kwetter.model.Tweet;
import com.mycompany.kwetter.model.User;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
public class TweetDAO {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public void create(Tweet obj) 
    {
        em.persist(obj);
    }

    public Tweet read(Long id) 
    {
        try 
        {
            return this.em.createNamedQuery("tweet_get", Tweet.class).setParameter("id", id).getSingleResult();
        } catch (javax.persistence.NoResultException e) 
        {
            return null;
        }
    }

    public void update(Tweet obj) 
    {
        em.merge(obj);
    }

    @Transactional
    public void delete(Tweet obj) 
    {
        em.remove(obj);
    }

    public List<Tweet> list() 
    {
        return this.em.createNamedQuery("tweet_all", Tweet.class).getResultList();
    }

    public List<Tweet> listByUser(User user) 
    {
        return this.em.createNamedQuery("tweet_byuser", Tweet.class).setParameter("id", user.getId()).getResultList();
    }

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwetter.Dao;

import com.mycompany.kwetter.model.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author Pieter
 */
public class UserDAO
{
    @PersistenceContext
    EntityManager em;

    @Transactional
    public void create(User obj) 
    {
        em.persist(obj);
    }

    public User read(Long id) 
    {
        try 
        {
            return this.em.createNamedQuery("user_get", User.class).setParameter("id", id).getSingleResult();
        } catch (javax.persistence.NoResultException e) 
        {
            return null;
        }
    }

    public void update(User obj) 
    {
        em.merge(obj);
    }

    @Transactional
    public void delete(User obj) 
    {
        em.remove(obj);
    }

    public List<User> list() 
    {
        return this.em.createNamedQuery("user_all", User.class).getResultList();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwetter.model;

import com.mycompany.kwetter.Dao.UserDAO;
import com.mycompany.kwetter.Dao.UserService;
import java.security.Principal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pieter
 */
public class UserTest
{
    
   
    
    UserDAO dao;

    Principal userPrincipal;

    UserService us;

    User u1;
    User u2;

    @Before
    public void setUp() throws Exception {
        us = new UserService();
        
        u1 = new User("Pieter Kegel", "nl", "pieter.nl", "ik ben Pieter!");
        
        u2 = new User("henk henkster", "nl", "-", "Hoi, ik ben henkster de prankster >:)");
        us.save(u1);
        us.save(u2);
    }

    @Test
    public void testTest()
    {
        assertTrue(true);
    }
}
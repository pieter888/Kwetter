/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwetter.model;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Pieter
 */


/**
 * Kweet
 *
 */
@Entity
@XmlRootElement
public class Tweet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    
    private String message;
    
    @ManyToOne(optional=false)
    private User creator;
    
    
    @Temporal(TemporalType.DATE)
    private Date postDate;
    
    
    public Tweet(User creator, String message)
    {
    	this.setMessage(message);
    	this.setCreator(creator);
    }

    public Tweet()
    {
        
    }
    
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDateTime) {
		this.postDate = postDate;
	}

}
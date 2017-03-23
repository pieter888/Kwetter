/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwetter.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Pieter
 */


/**
 * User
 *
 */
@Entity
@XmlRootElement
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String infoName;
    private String infoLocation;
    private String infoWeb;
    private String infoBio;
    
    @ManyToMany(fetch=FetchType.EAGER)
    private List<User> followers;
    
    @ManyToMany(fetch=FetchType.EAGER)
    private List<User> following;
    
    @OneToMany(mappedBy="creator",targetEntity=Tweet.class, fetch=FetchType.EAGER)
    private List<Tweet> tweets; 
    
    public User()
    {
    	
    }

    public long getId()
    {
        return id;
    }
    
	public String getInfoName() {
		return infoName;
	}

	public void setInfoName(String infoName) {
		this.infoName = infoName;
	}

	public String getInfoLocation() {
		return infoLocation;
	}

	public void setInfoLocation(String infoLocation) {
		this.infoLocation = infoLocation;
	}

	public String getInfoWeb() {
		return infoWeb;
	}

	public void setInfoWeb(String infoWeb) {
		this.infoWeb = infoWeb;
	}

	public List<User> getFollowers() {
		return followers;
	}

	public void setFollowers(List<User> followers) {
		this.followers = followers;
	}

	public String getInfoBio() {
		return infoBio;
	}

	public void setInfoBio(String infoBio) {
		this.infoBio = infoBio;
	}

	public List<User> getFollowing() {
		return following;
	}

	public void setFollowing(List<User> following) {
		this.following = following;
	}

	public List<Tweet> getKweets() {
		return tweets;
	}

	public void setKweets(List<Tweet> kweets) {
		this.tweets = kweets;
	}
}
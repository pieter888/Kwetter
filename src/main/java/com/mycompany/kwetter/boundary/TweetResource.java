/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kwetter.boundary;

import com.mycompany.kwetter.model.Tweet;
import com.mycompany.kwetter.model.User;
import com.mycompany.kwetter.model.test;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Pieter
 */
@Path("/tweets")
public class TweetResource
{
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response read(@PathParam("id") Long id) 
    {
        test obj = new test(1,"hello");
        //Tweet t = new Tweet(new User(), "Hallo");
        
        return Response.status(201).entity(obj).build();
    }
}

package com.mycompany.kwetter.model;

import com.mycompany.kwetter.model.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-22T12:23:20")
@StaticMetamodel(Tweet.class)
public class Tweet_ { 

    public static volatile SingularAttribute<Tweet, User> creator;
    public static volatile SingularAttribute<Tweet, Date> postDate;
    public static volatile SingularAttribute<Tweet, Long> id;
    public static volatile SingularAttribute<Tweet, String> message;

}
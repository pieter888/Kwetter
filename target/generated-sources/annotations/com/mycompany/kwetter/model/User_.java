package com.mycompany.kwetter.model;

import com.mycompany.kwetter.model.Tweet;
import com.mycompany.kwetter.model.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-22T12:23:20")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> infoName;
    public static volatile SingularAttribute<User, String> infoWeb;
    public static volatile ListAttribute<User, User> followers;
    public static volatile ListAttribute<User, User> following;
    public static volatile SingularAttribute<User, String> infoLocation;
    public static volatile SingularAttribute<User, Long> id;
    public static volatile ListAttribute<User, Tweet> tweets;
    public static volatile SingularAttribute<User, String> infoBio;

}
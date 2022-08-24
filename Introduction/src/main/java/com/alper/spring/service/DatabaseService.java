package com.alper.spring.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
 You can use profiles (even multiple profiles, use a list or the &) so that the application can change based on a profile,
 for example you may want a test profile which uses a different database, etc.
 You use the @Profile annotation and then configure the application.properties file you use the profile that you require,
 only the beans that match the profile will be pulled into the spring context.
 By default if no profile has been set then spring will use the default profile.
 */
@Service
@Profile({"Prod","Default","test"})
public class DatabaseService {
    //some stuff
}

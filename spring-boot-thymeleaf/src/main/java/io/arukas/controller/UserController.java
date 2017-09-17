package io.arukas.controller;

import io.arukas.model.User;
import io.arukas.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by niuyuxian on 17/09/2017.
 */
@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User saveUser(@RequestBody User user){

        if(logger.isDebugEnabled()){
            logger.debug("user: {}", user);
        }

        user = userService.saveUser(user);

        return user;
    }

}

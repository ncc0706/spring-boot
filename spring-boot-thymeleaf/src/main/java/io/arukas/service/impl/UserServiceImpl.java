package io.arukas.service.impl;

import io.arukas.model.User;
import io.arukas.repository.UserRepository;
import io.arukas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * Created by niuyuxian on 17/09/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        user = userRepository.save(user);
        return user;
    }
}

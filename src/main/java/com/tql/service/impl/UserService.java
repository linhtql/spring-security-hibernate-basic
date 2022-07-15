package com.tql.service.impl;

import com.tql.entities.User;
import com.tql.repository.UserRepository;
import com.tql.service.IUserService;
import com.tql.utils.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService, UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("Not found :"+username);
        }
        return new CustomUserDetails(user);
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }
}

package com.example.taskmaganement.service;

import com.example.taskmaganement.model.User;
import com.example.taskmaganement.repository.UserRepository;

import java.util.Collections;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Load user from database
        // For example:
        return new org.springframework.security.core.userdetails.User(
            "username",
            "password",
            Collections.emptyList() // Replace with actual roles/authorities
        );
    }
}


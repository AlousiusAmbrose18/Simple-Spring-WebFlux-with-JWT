package com.alo.webpro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.alo.webpro.entity.UserInfo;
import com.alo.webpro.repository.UserInfoRepository;

@Service
public class UserService {
	
	@Autowired
    private UserInfoRepository repository;
	

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    public String addUser(UserInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        return "user added to system ";
    }

}

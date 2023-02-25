package com.alo.webpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alo.webpro.entity.UserInfo;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByName(String username);

}

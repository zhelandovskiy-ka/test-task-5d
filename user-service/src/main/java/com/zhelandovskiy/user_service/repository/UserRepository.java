package com.zhelandovskiy.user_service.repository;

import com.zhelandovskiy.user_service.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByLastName(String lastName);
}
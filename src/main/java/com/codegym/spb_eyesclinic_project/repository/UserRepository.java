package com.codegym.spb_eyesclinic_project.repository;


import com.codegym.spb_eyesclinic_project.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByPhoneNumber(String phoneNumber);

    boolean existsByPhoneNumber(String phoneNumber);




}
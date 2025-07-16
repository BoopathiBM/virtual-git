package com.virtualGit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtualGit.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

package com.virtualGit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtualGit.entity.GitRepository;

@Repository
public interface GitRepositoryRepository extends JpaRepository<GitRepository, Long> {

	List<GitRepository> findByOwnerId(Long ownerId);
}

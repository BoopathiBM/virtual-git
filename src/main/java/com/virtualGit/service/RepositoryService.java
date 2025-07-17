package com.virtualGit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtualGit.DTO.RepoRequest;
import com.virtualGit.DTO.RepoResponse;
import com.virtualGit.entity.GitRepository;
import com.virtualGit.repo.GitRepositoryRepository;
import com.virtualGit.repo.UserRepository;

@Service
public class RepositoryService {

	@Autowired
	private GitRepositoryRepository gitRepositoryRepository;

	@Autowired
	private UserRepository userRepository;

	public RepoResponse createRepository( RepoRequest request){
		GitRepository repo = new GitRepository();
		
	}

}

package com.virtualGit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtualGit.DTO.RepoRequest;
import com.virtualGit.DTO.RepoResponse;
import com.virtualGit.service.RepositoryService;

@RestController
@RequestMapping("/api/repos")
public class RepositoryController {

	@Autowired
	private RepositoryService repositoryService;

	@PostMapping("/create")
	public RepoResponse create(@RequestBody RepoRequest request) {
		return repositoryService.createRepository(request);
	}

	@GetMapping("/user/{userId}")
	public List<RepoResponse> geUserRepos(@PathVariable Long userId){
		return repositoryService.getUserRepositories(userId);
	}

}

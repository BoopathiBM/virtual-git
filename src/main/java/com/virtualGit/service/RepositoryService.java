package com.virtualGit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

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

    public RepoResponse createRepository(RepoRequest request) {
        GitRepository repo = new GitRepository();
        repo.setName(request.name);

        repo.setOwner(userRepository.findById(request.userId)
                .orElseThrow(() -> new RuntimeException("User not found")));
        GitRepository saved = gitRepositoryRepository.save(repo);

        RepoResponse response = new RepoResponse();
        response.id = saved.getId();
        response.name = saved.getName();
        response.ownerId = saved.getOwner().getId();
        return response;
    }

	public List<RepoResponse> getUserRepositories(Long userId){
		
		List<GitRepository> repos = gitRepositoryRepository.findByOwnerId(userId);
		List<RepoResponse> responses = new ArrayList<>();
		for(GitRepository r : repos) {
			RepoResponse res = new RepoResponse();
			res.id = r.getId();
			res.name = r.getName();
			res.ownerId = r.getOwner().getId();
			responses.add(res);
		}
		return responses;
	}

}

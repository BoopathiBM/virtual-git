package com.virtualGit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtualGit.entity.Commit;

@Repository
public interface CommitRepository extends JpaRepository<Commit, Long> {

	List<Commit> findByRepositoryId(Long repoId);
}

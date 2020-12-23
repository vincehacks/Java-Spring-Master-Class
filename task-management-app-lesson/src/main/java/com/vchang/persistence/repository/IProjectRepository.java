package com.vchang.persistence.repository;

import java.util.Optional;

import com.vchang.persistence.model.Project;

public interface IProjectRepository {
	
	public Optional<Project> findById(Long id);
	
	public Project save(Project project);
}


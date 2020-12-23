package com.vchang.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.vchang.persistence.model.Project;
import com.vchang.persistence.repository.IProjectRepository;
import com.vchang.service.IProjectService;

public class ProjectServiceImpl implements IProjectService{

	@Autowired
	private IProjectRepository projectRepo;
	
	@Override
	public Optional<Project> findById(Long id) {
		return projectRepo.findById(id);
	}
	
	@Override
	public Project save (Project project) {
		return projectRepo.save(project);
	}
}

package com.vchang.persistence.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.vchang.persistence.model.Project;
import com.vchang.persistence.repository.IProjectRepository;

public class ProjectRepositoryImpl implements IProjectRepository {
	List<Project> projects = new ArrayList<>();

	@Override
	public Optional<Project> findById(Long id) {
		// For every Project object in projects, filter to find the first project that
		// matches the id and return this Optional back 
		return projects.stream().filter(p -> p.getId() == id).findFirst();
	}
	
	@Override
	public Project save(Project project) {
		Project existingProject = findById(project.getId()).orElse(null);
		if(existingProject == null) {
			projects.add(project);
		}
		else {
			// This is the update that will first remove the project, create a new one then add to list
			projects.remove(existingProject);
			Project newProject = new Project(project);
			projects.add(newProject);
		}
		return project;
	}
}

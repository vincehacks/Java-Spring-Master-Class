package com.vchang.service;

import java.util.Optional;

import com.vchang.persistence.model.Project;

public interface IProjectService {

	Optional<Project> findById(Long id);

	Project save(Project project);

}

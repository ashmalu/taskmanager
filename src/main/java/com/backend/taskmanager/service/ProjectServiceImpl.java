package com.backend.taskmanager.service;

import com.backend.taskmanager.entity.Project;
import com.backend.taskmanager.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project addProject(Project project) {
        projectRepository.save(project);
        return project;
    }

    @Override
    public Project editProjectDetails(Project project) {
        projectRepository.deleteById(project.getProjectId());
        projectRepository.save(project);
        return project;
    }

    @Override
    public void removeProject(Integer id) {
        projectRepository.deleteById(id);
    }
}

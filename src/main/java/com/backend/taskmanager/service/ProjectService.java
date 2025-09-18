package com.backend.taskmanager.service;

import com.backend.taskmanager.entity.Project;

import java.util.List;

public interface ProjectService {

    public List<Project> getAllProjects();

    public Project addProject(Project project);

    Project editProjectDetails(Project project);

    void removeProject(Integer id);
}

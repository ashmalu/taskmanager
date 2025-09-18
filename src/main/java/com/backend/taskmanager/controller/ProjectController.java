package com.backend.taskmanager.controller;

import com.backend.taskmanager.entity.Project;
import com.backend.taskmanager.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to TaskManager!!";
    }

    @GetMapping("/getAllProjects")
    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @PostMapping("/addProject")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Project addProject(@RequestBody Project project) {
        return projectService.addProject(project);
    }

    @PutMapping("/editProject")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Project editProjectDetails(@RequestBody Project project) {
        return projectService.editProjectDetails(project);
    }

    @DeleteMapping("/removeProject/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String deleteProject(@PathVariable("id") Integer id){
        projectService.removeProject(id);
        return "Project deleted Successfully";
    }
}

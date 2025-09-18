package com.backend.taskmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Project")
@Table(name = "Project")
public class Project {
    @Id
    private int projectId;
    private String projectName;
    private String dateOfStart;
    private int teamSize;

    public Project(int projectId, String projectName, String dateOfStart, int teamSize) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.dateOfStart = dateOfStart;
        this.teamSize = teamSize;
    }

    public Project() {
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}

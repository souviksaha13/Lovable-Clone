package com.sahasouvik.projects.Lovable_Clone.service;

import com.sahasouvik.projects.Lovable_Clone.dto.project.ProjectRequest;
import com.sahasouvik.projects.Lovable_Clone.dto.project.ProjectResponse;
import com.sahasouvik.projects.Lovable_Clone.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserByProjectId(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}

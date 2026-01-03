package com.sahasouvik.projects.Lovable_Clone.service;

import com.sahasouvik.projects.Lovable_Clone.dto.project.FileContentResponse;
import com.sahasouvik.projects.Lovable_Clone.dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}

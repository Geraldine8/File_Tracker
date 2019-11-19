package com.codeclan.example.files_and_folders.Repositories;

import com.codeclan.example.files_and_folders.Models.Folder;
import com.codeclan.example.files_and_folders.Projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}

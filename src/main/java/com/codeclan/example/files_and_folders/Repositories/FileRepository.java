package com.codeclan.example.files_and_folders.Repositories;

import com.codeclan.example.files_and_folders.Models.File;
import com.codeclan.example.files_and_folders.Projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}

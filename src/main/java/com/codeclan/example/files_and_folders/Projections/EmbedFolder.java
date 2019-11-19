package com.codeclan.example.files_and_folders.Projections;

import com.codeclan.example.files_and_folders.Models.File;
import com.codeclan.example.files_and_folders.Models.Folder;
import com.codeclan.example.files_and_folders.Models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="embedFolder", types = Folder.class)
public interface EmbedFolder {
    Long getId();
    String getTitle();
    List<File> getFiles();
    User getUser();

}

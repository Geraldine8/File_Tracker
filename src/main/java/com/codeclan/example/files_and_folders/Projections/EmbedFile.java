package com.codeclan.example.files_and_folders.Projections;

import com.codeclan.example.files_and_folders.Models.File;
import com.codeclan.example.files_and_folders.Models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedFile", types = File.class)
public interface EmbedFile {

    Long id();
    String getname();
    String getExtension();
    int getSize();
    Folder getFolder();
}

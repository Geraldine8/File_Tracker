package com.codeclan.example.files_and_folders.Projections;

import com.codeclan.example.files_and_folders.Models.Folder;
import com.codeclan.example.files_and_folders.Models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="embedUser", types = User.class)
public interface EmbedUser {

    Long id();
    String name();
    List<Folder> getFolders();
}

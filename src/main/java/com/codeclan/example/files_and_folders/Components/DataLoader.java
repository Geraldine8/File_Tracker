package com.codeclan.example.files_and_folders.Components;

import com.codeclan.example.files_and_folders.Models.File;
import com.codeclan.example.files_and_folders.Models.Folder;
import com.codeclan.example.files_and_folders.Models.User;
import com.codeclan.example.files_and_folders.Repositories.FileRepository;
import com.codeclan.example.files_and_folders.Repositories.FolderRepository;
import com.codeclan.example.files_and_folders.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User user = new User("Geraldine Ramirez");
        userRepository.save(user);

        Folder folder = new Folder("Music", user);
        folderRepository.save(folder);

        File file = new File("Rock Album", "mp3",12,folder);
        fileRepository.save(file);
    }
}
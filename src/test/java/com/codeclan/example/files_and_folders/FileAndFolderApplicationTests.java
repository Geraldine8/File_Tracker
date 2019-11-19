package com.codeclan.example.files_and_folders;

import com.codeclan.example.files_and_folders.Models.Folder;
import com.codeclan.example.files_and_folders.Models.User;
import com.codeclan.example.files_and_folders.Repositories.FileRepository;
import com.codeclan.example.files_and_folders.Repositories.FolderRepository;
import com.codeclan.example.files_and_folders.Repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileAndFolderApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;


	@Test
	void contextLoads() {
	}


	@Test
	public void createUserAndFolder(){
		User user = new User("Geraldine Ramirez");
		userRepository.save(user);

		Folder folder = new Folder("Music", user);
		folderRepository.save(folder);

	}

}

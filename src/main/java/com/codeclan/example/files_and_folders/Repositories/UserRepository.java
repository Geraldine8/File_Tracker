package com.codeclan.example.files_and_folders.Repositories;


import com.codeclan.example.files_and_folders.Models.User;
import com.codeclan.example.files_and_folders.Projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}

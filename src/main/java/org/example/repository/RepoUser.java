package org.example.repository;

import org.example.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

public interface RepoUser extends JpaRepository<Users, String> {

    List<Users> findAllById(String username, String Pass);
    List<Users> findAllByUsername(String Username);

}

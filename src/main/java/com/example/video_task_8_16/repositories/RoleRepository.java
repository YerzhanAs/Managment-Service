package com.example.video_task_8_16.repositories;

import com.example.video_task_8_16.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RoleRepository  extends JpaRepository<Roles, Long> {

    Roles findByRole(String role);
}

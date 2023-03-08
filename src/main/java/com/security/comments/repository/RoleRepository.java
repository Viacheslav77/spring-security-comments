package com.security.comments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.comments.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}

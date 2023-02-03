package com.primas.java.springbootsecurityrest.progettosecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primas.java.springbootsecurityrest.progettosecurity.models.ERole;
import com.primas.java.springbootsecurityrest.progettosecurity.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
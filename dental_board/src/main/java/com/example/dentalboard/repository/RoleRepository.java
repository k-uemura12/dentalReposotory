package com.example.dentalboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dentalboard.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    public Role findByName(String name);
}
package com.simplilearn.myboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.myboot.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	

}

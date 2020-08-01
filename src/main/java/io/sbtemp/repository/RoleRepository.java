package io.sbtemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.sbtemp.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String string);

}

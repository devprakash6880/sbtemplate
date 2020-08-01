package io.sbtemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.sbtemp.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findUserByUserName(String userName);

	User findUserByEmailAddress(String emailAddress);


}

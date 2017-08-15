package org.ruken.college.jpa.repository;

import org.ruken.college.jpa.model.UserProfile;;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WebsiteRegistrationJpaRepository extends JpaRepository<UserProfile, String> {

	/*SQL query to retrieve rows with specified parameters*/
	/*Select * from user_profile where email=email and password=password*/

    List<UserProfile> findByEmailAndPassword(String email, String password);
}
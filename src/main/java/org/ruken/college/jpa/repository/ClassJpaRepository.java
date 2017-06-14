package org.ruken.college.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 
import org.ruken.college.jpa.model.Class;

@Repository
public interface ClassJpaRepository extends JpaRepository<Class, Integer> {

	
}

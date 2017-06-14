package org.ruken.college.jpa.repository;

import org.ruken.college.jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Integer> {

	
}

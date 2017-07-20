package org.ruken.college.jpa.repository;

import org.ruken.college.jpa.model.ReservedClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservedClassJpaRepository extends JpaRepository<ReservedClass, Integer> {


}

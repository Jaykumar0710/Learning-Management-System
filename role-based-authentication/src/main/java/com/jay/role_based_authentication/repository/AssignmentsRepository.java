package com.jay.role_based_authentication.repository;

import com.jay.role_based_authentication.model.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentsRepository extends JpaRepository<Assignments, Long> {
}

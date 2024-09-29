package com.jay.role_based_authentication.repository;

import com.jay.role_based_authentication.model.StuDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuDetailsRepository extends JpaRepository<StuDetails, Long> {
}

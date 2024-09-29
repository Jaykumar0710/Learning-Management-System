package com.jay.role_based_authentication.repository;

import com.jay.role_based_authentication.model.StudyMaterials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyMaterialsRepository extends JpaRepository<StudyMaterials,Long> {
}

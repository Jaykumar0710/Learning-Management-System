package com.jay.role_based_authentication.repository;

import com.jay.role_based_authentication.model.LiveLecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LiveLectureRepository extends JpaRepository<LiveLecture, Long> {
}

package com.jay.role_based_authentication.repository;

import com.jay.role_based_authentication.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}

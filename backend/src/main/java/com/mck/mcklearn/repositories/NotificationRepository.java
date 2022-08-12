package com.mck.mcklearn.repositories;

import com.mck.mcklearn.entities.Lesson;
import com.mck.mcklearn.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}

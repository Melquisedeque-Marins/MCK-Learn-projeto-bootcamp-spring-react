package com.mck.mcklearn.repositories;

import com.mck.mcklearn.entities.Enrollment;
import com.mck.mcklearn.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
}

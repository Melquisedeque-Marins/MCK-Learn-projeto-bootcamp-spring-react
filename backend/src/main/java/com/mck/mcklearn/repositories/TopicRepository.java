package com.mck.mcklearn.repositories;

import com.mck.mcklearn.entities.Section;
import com.mck.mcklearn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
}

package com.mck.mcklearn.repositories;

import com.mck.mcklearn.entities.Course;
import com.mck.mcklearn.entities.Deliver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliverRepository extends JpaRepository<Deliver, Long> {
}

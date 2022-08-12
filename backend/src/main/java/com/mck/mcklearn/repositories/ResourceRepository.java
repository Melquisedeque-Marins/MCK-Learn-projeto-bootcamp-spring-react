package com.mck.mcklearn.repositories;

import com.mck.mcklearn.entities.Reply;
import com.mck.mcklearn.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
}

package com.mck.mcklearn.repositories;

import com.mck.mcklearn.entities.Topic;
import com.mck.mcklearn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

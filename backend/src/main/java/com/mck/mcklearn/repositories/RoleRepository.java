package com.mck.mcklearn.repositories;

import com.mck.mcklearn.entities.Role;
import com.mck.mcklearn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}

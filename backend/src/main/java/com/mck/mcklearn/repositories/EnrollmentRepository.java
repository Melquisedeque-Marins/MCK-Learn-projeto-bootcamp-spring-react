package com.mck.mcklearn.repositories;

import com.mck.mcklearn.entities.Deliver;
import com.mck.mcklearn.entities.Enrollment;
import com.mck.mcklearn.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}

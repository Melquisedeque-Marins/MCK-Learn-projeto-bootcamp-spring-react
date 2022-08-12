package com.mck.mcklearn.repositories;

import com.mck.mcklearn.entities.Resource;
import com.mck.mcklearn.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
}

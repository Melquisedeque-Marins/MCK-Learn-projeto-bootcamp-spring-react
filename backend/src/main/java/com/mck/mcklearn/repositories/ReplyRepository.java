package com.mck.mcklearn.repositories;

import com.mck.mcklearn.entities.Offer;
import com.mck.mcklearn.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {
}

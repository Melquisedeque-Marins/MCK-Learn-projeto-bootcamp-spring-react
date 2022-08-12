package com.mck.mcklearn.repositories;

import com.mck.mcklearn.entities.Notification;
import com.mck.mcklearn.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
}

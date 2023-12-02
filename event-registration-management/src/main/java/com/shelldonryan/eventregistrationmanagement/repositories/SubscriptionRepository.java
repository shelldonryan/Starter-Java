package com.shelldonryan.eventregistrationmanagement.repositories;

import com.shelldonryan.eventregistrationmanagement.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}

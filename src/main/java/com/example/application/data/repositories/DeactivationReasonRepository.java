package com.example.application.data.repositories;

import com.example.application.data.entities.DeactivationReason;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeactivationReasonRepository extends JpaRepository<DeactivationReason, Integer> {
}

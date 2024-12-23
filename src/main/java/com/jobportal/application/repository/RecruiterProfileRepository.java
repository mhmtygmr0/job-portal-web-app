package com.jobportal.application.repository;

import com.jobportal.application.entity.RecruiterProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile, Integer> {
}

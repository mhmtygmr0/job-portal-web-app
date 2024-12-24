package com.jobportal.application.repository;

import com.jobportal.application.entity.JobPostActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostActivityRepository extends JpaRepository<JobPostActivity, Integer> {
}

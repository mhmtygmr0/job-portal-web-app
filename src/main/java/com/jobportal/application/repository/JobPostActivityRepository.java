package com.jobportal.application.repository;

import com.jobportal.application.entity.JobPostActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobPostActivityRepository extends JpaRepository<JobPostActivity, Integer> {

    List<IRecruiterJob> getRecruiterJobs(@Param("recruiter") int recruiter);
}

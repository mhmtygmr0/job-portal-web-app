package com.jobportal.application.service;

import com.jobportal.application.entity.JobPostActivity;
import com.jobportal.application.entity.RecruiterJobsDto;
import com.jobportal.application.repository.JobPostActivityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostActivityService {

    private final JobPostActivityRepository jobPostActivityRepository;

    public JobPostActivityService(JobPostActivityRepository jobPostActivityRepository) {
        this.jobPostActivityRepository = jobPostActivityRepository;
    }

    public JobPostActivity addNew(JobPostActivity jobPostActivity) {
        return this.jobPostActivityRepository.save(jobPostActivity);
    }

    public List<RecruiterJobsDto> getRecruiterJobs(int recruiter) {

    }
}

package com.jobportal.application.service;

import com.jobportal.application.entity.JobPostActivity;
import com.jobportal.application.entity.JobSeekerApply;
import com.jobportal.application.entity.JobSeekerProfile;
import com.jobportal.application.repository.JobSeekerApplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerApplyService {

    private final JobSeekerApplyRepository jobSeekerApplyRepository;

    @Autowired
    public JobSeekerApplyService(JobSeekerApplyRepository jobSeekerApplyRepository) {
        this.jobSeekerApplyRepository = jobSeekerApplyRepository;
    }

    public List<JobSeekerApply> getCandidatesJobs(JobSeekerProfile userAccountID) {
        return this.jobSeekerApplyRepository.findByUserId(userAccountID);
    }

    public List<JobSeekerApply> getJobCandidates(JobPostActivity job) {
        return this.jobSeekerApplyRepository.findByJob(job);
    }
}

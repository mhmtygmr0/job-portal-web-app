package com.jobportal.application.service;

import com.jobportal.application.entity.JobSeekerProfile;
import com.jobportal.application.entity.RecruiterProfile;
import com.jobportal.application.entity.Users;
import com.jobportal.application.repository.JobSeekerProfileRepository;
import com.jobportal.application.repository.RecruiterProfileRepository;
import com.jobportal.application.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class UsersService {

    private final UsersRepository usersRepository;
    private final JobSeekerProfileRepository jobSeekerProfileRepository;
    private final RecruiterProfileRepository recruiterProfileRepository;

    public UsersService(UsersRepository usersRepository, JobSeekerProfileRepository jobSeekerProfileRepository, RecruiterProfileRepository recruiterProfileRepository) {
        this.usersRepository = usersRepository;
        this.jobSeekerProfileRepository = jobSeekerProfileRepository;
        this.recruiterProfileRepository = recruiterProfileRepository;
    }

    public Users addNew(Users users) {
        users.setActive(true);
        users.setRegistrationDate(new Date(System.currentTimeMillis()));
        Users savedUser = this.usersRepository.save(users);
        int userTypeId = users.getUserTypeId().getUserTypeId();

        if (userTypeId == 1) {
            this.recruiterProfileRepository.save(new RecruiterProfile(savedUser));
        } else {
            this.jobSeekerProfileRepository.save(new JobSeekerProfile(savedUser));
        }

        return savedUser;
    }

    public Optional<Users> getUserByEmail(String email) {
        return this.usersRepository.findByEmail(email);
    }
}

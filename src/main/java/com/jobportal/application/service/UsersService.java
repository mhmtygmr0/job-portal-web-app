package com.jobportal.application.service;

import com.jobportal.application.entity.Users;
import com.jobportal.application.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users addNew(Users users) {
        users.setActive(true);
        users.setRegistrationDate(new Date(System.currentTimeMillis()));
        return this.usersRepository.save(users);
    }

    public Optional<Users> getUserByEmail(String email) {
        return this.usersRepository.findByEmail(email);
    }
}

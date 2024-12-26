JOB PORTAL WEB APP

A Spring Boot-based backend application designed to manage job postings and applications for a job portal.

FEATURES

User management (registration, login, and roles)

CRUD operations for job postings

Application management for users

RESTful API design

Database integration using JPA and Hibernate

Role-based access control (Admin, Recruiter, and Job Seeker)

TECHNOLOGIES USED

Backend Framework: Spring Boot

Programming Language: Java 21

Database: MySQL / H2 (for local development)

ORM: Hibernate / JPA

Dependency Management: Maven

Security: Spring Security with JWT Authentication

NOTE ON FRONTEND

The frontend part of this project was pre-designed and is not developed by me. This repository only includes the backend implementation.

PREREQUISITES

Ensure you have the following installed:

Java 21

Maven 3.8 or later

MySQL (if using a production database)

GETTING STARTED

STEP 1: CLONE THE REPOSITORY

git clone https://github.com/mhmtygmr0/job-portal-web-app.git
cd job-portal-web-app

STEP 2: CONFIGURE THE DATABASE

Edit the application.properties file to configure your database:

spring.datasource.url=jdbc:mysql://localhost:3306/job_portal
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

STEP 3: BUILD AND RUN THE APPLICATION

mvn clean install
mvn spring-boot:run

The application will start at http://localhost:8080.

API DOCUMENTATION

AUTHENTICATION

POST /api/auth/register: Register a new user

POST /api/auth/login: Authenticate and receive a JWT token

JOBS

GET /api/jobs: List all jobs

POST /api/jobs: Create a new job (Admin/Recruiter only)

PUT /api/jobs/{id}: Update a job (Admin/Recruiter only)

DELETE /api/jobs/{id}: Delete a job (Admin/Recruiter only)

APPLICATIONS

POST /api/applications: Apply for a job

GET /api/applications: List all applications (Admin only)

CONTRIBUTING

Contributions are welcome! Follow these steps:

Fork the repository

Create a new branch (git checkout -b feature/your-feature)

Commit your changes (git commit -m 'Add some feature')

Push to the branch (git push origin feature/your-feature)

Open a pull request

LICENSE

This project is licensed under the MIT License. See the LICENSE file for more information.

Feel free to reach out for any questions or suggestions!


# <p align="center">Job Portal Web App</p>

## <p align="center">This application facilitates the management of job postings and applications for a job portal, enabling role-based access for administrators, recruiters, and job seekers. Continue reading to learn more details about its features and setup.</p>

---

### Features of the Application:
- **User Management**: Handles user registration, login, and role assignment.
- **CRUD Operations**: Allows creating, reading, updating, and deleting job postings.
- **Application Management**: Enables users to apply for jobs and manage their applications.
- **Role-Based Access Control**: Ensures specific actions are restricted to roles (Admin, Recruiter, Job Seeker).
- **RESTful API Design**: Clean API endpoints for seamless integration.
- **Database Integration**: Manages data with JPA and Hibernate.

---

### User Roles and Functionalities:
1. **Job Seeker**:
   - Register and log in to the portal.
   - Browse and search for job postings.
   - Apply for jobs and track applications.
2. **Recruiter**:
   - Register and log in to the portal.
   - Post new job opportunities.
   - Manage job postings (update or delete).
   - View applications submitted by Job Seekers.

---

### Technologies Used:
- **Backend Framework**: Spring Boot
- **Programming Language**: Java 21
- **Database**: MySQL (or H2 for local development)
- **ORM**: Hibernate / JPA
- **Dependency Management**: Maven
- **Security**: Spring Security with JWT Authentication

---

### Screenshots

| ![Image 1](screenshots/Ekran%20görüntüsü%202024-12-28%20114400.png) | ![Image 2](screenshots/Ekran%20görüntüsü%202024-12-28%20114430.png) | ![Image 3](screenshots/Ekran%20görüntüsü%202024-12-28%20114546.png) |
|----------------------------------------------------------------------|----------------------------------------------------------------------|----------------------------------------------------------------------|

| ![Image 4](screenshots/Ekran%20görüntüsü%202024-12-28%20114606.png) | ![Image 5](screenshots/Ekran%20görüntüsü%202024-12-28%20114653.png) | ![Image 6](screenshots/Ekran%20görüntüsü%202024-12-28%20114710.png) |
|----------------------------------------------------------------------|----------------------------------------------------------------------|----------------------------------------------------------------------|


---

## Installation

Before you begin, ensure you have the following installed on your machine:
- **Java Development Kit (JDK) 21**: [Download and Install JDK](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
- **Maven 3.8 or later**: [Download and Install Maven](https://maven.apache.org/install.html)
- **MySQL**: [Download MySQL](https://www.mysql.com/downloads/)
- **Git**: [Download and Install Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
- **IntelliJ IDEA** (or another IDE): [Download IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

---

### Clone the Repository

1. Clone the repository:  
   `git clone https://github.com/mhmtygmr0/job-portal-web-app.git`
2. Navigate to the project directory:  
   `cd job-portal-web-app`
3. Open the project in your IDE.

---

### Database Setup

1. Create a database named `jobportal` in MySQL.
2. Update the database configuration in `src/main/resources/application.properties` with your database details:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/jobportal
   spring.datasource.username=jobportal
   spring.datasource.password=jobportal
   spring.jpa.hibernate.ddl-auto=update
   ```
3. (Optional) Use H2 for local development by updating the configuration in `application.properties`.

---

### Build and Run the Application

1. Build the project:  
   `mvn clean install`
2. Run the project:  
   `mvn spring-boot:run`

The application will start at: [http://localhost:8080](http://localhost:8080)

---

## Notes on the Frontend

The frontend of this project was pre-designed and is not included in this repository. This repository only contains the backend implementation.

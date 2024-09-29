# Online Learning Management System (LMS)

## Project Overview

This is a fully functional **Online Learning Management System** (LMS) built using **Spring Boot**, **REST APIs**, **JPA/Hibernate**, **MySQL**, **Spring Security**, and **Thymeleaf**. The platform allows instructors to create and manage courses, while students can enroll, track their progress, and take quizzes. The project also includes role-based authentication and authorization, ensuring a secure and personalized experience for both students and instructors.

## Features

### User Management
- **Role-Based Access**: Separate functionalities for students, instructors, and admin (optional).
- **Student Features**:
  - Browse and enroll in courses.
  - Track progress and lesson completion.
  - Take quizzes and submit assignments.
- **Instructor Features**:
  - Create and manage courses.
  - Upload lessons (text, video, PDFs).
  - Create quizzes for student evaluations.
- **Admin Features** (Optional):
  - Manage users, courses, and platform settings.

### Course Management
- Instructors can create, update, and delete courses.
- Upload course materials including text, videos, and documents.
- Set prerequisites and organize lessons into modules.
- Quizzes to test student knowledge after lessons.

### Quizzes and Progress Tracking
- Students can take quizzes and view results in real time.
- Progress tracking to display course completion percentage and detailed statistics.
- Instructors can evaluate and provide feedback on student submissions.

## Tech Stack

### Backend:
- **Spring Boot**: For creating the REST API and service layer.
- **Spring Security**: For authentication and role-based authorization.
- **JPA/Hibernate**: ORM for database operations.
- **MySQL**: Database for storing user data, courses, lessons, quizzes, and progress tracking.

### Frontend:
- **Thymeleaf**: Templating engine for generating dynamic HTML content.
- **Bootstrap**: For responsive design and modern UI components.

## Project Structure

```bash
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/lms
│   │   │       ├── controllers  # All REST API and view controllers
│   │   │       ├── models       # JPA entity models (User, Course, Lesson, Quiz, etc.)
│   │   │       ├── services     # Business logic and service classes
│   │   │       ├── repositories # Data access layer using JPA repositories
│   │   └── resources
│   │       ├── templates               # Thymeleaf templates (HTML files)
│   │       ├── application.properties  # Configuration properties (MySQL, Security, etc.)
│   └── test
└── pom.xml                       # Maven build configuration



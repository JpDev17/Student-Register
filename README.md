# StudentRegister

## About StudentRegister
StudentRegister is a RESTful API and web application that allows you to create, read, update, and delete university student records.
Each record contains detailed information such as the student's name, age, gender, email, registration number, major, grade, and photo.
This project is a Spring Boot application built with:
* Spring Data JPA
* Spring Web
* Spring Boot DevTools
* H2 Database
* Flyway Migration
* Thymeleaf
* Swagger

The goal of this project is to manage and visualize a university student database, providing easy RESTful and web-based access to student information. 

## Setup
### Requirements
* Java 21
* Maven

### Spring Boot Dependencies
* Spring Data JPA
* Spring Web
* Spring Boot DevTools
* H2 Database
* Flyway Migration
* Thymeleaf
* Springdoc OpenAPI (Swagger UI)

## How to Run
1. Clone the repository:
```bash
git clone https://github.com/JpDev17/StudentRegister.git
```
2. Navigate to the project folder:
```bash
cd StudentRegister
```
3. Run the application:
```bash
mvn spring-boot:run
```
4. Access the API or UI:
* Swagger UI: http://localhost:8080/swagger-ui.html
* Thymeleaf Web Interface: http://localhost:8080/student/ui
* wAPI Base URL: http://localhost:8080/api/student

## Database Schema
Table: tb_student_register
| Column Name | Type | Description |
|--------------|------|-------------|
| id | BIGINT | Auto-incremented primary key |
| name | VARCHAR(255) | Student full name |
| age | INT | Student age |
| gender | VARCHAR(50) | Student gender (MALE, FEMALE, OTHER) |
| email | VARCHAR(255) | Unique student email |
| registration | INT | Unique registration number |
| major | VARCHAR(255) | Student major or program |
| grade | FLOAT | Student grade or GPA |
| photo | VARCHAR(2083) | Student profile photo URL |

## API Endpoints
### Base URL
```bash
http://localhost:8080/api/student
```
### Create a Student
### POST /create
Registers a new student record.
Request body:
```bash
{
  "studentName": "Piper",
  "studentAge": 24,
  "studentGender": "FENAKE",
  "studentEmail": "20498233@university.com",
  "studentRegistration": 20498233,
  "studentMajor": "Bakery",
  "studentGrade": 7.5,
  "studentPhoto": "image.jpg"
}
```
Response:
```bash
{
  "id": 1,
  "studentName": "Piper",
  "studentAge": 24,
  "studentGender": "Female",
  "studentEmail": "20498233@university.com",
  "studentRegistration": 20498233,
  "studentMajor": "Bakery",
  "studentGrade": 7.5,
  "studentPhoto": "image.jpg"
}
```
### Get All Students
### GET /get
Retrieves all student records.
```bash
{
  "id": 1,
  "studentName": "Piper",
  "studentAge": 24,
  "studentGender": "FEMALE",
  "studentEmail": "20498233@university.com",
  "studentRegistration": 20498233,
  "studentMajor": "Bakery",
  "studentGrade": 7.5,
  "studentPhoto": "image.jpg"
}
{
  "id": 2,
  "studentName": "Mandy",
  "studentAge": 22,
  "studentGender": "FEMALE",
  "studentEmail": "20448920@university.com",
  "studentRegistration": 20448920,
  "studentMajor": "Chemistry",
  "studentGrade": 10,
  "studentPhoto": "image.jpg"
}
```
Response:
```bash
{
  "id": 1,
  "studentName": "Piper",
  "studentAge": 24,
  "studentGender": "FEMALE",
  "studentEmail": "20498233@university.com",
  "studentRegistration": 20498233,
  "studentMajor": "Bakery",
  "studentGrade": 7.5,
  "studentPhoto": "image.jpg"
}
{
  "id": 2,
  "studentName": "Mandy",
  "studentAge": 22,
  "studentGender": "FEMALE",
  "studentEmail": "20448920@university.com",
  "studentRegistration": 20448920,
  "studentMajor": "Chemistry",
  "studentGrade": 10,
  "studentPhoto": "image.jpg"
}
```
### Get Student by ID
### GET /get/{id}
Returns a student record by ID.

### Update a Student
### PUT /update/{id}
Updates a student record by ID.
Request body example:
```bash
{
  "studentName": "Piper",
  "studentAge": 24,
  "studentGender": "Female",
  "studentEmail": "20498233@university.com",
  "studentRegistration": 20498233,
  "studentMajor": "Astrophysics",
  "studentGrade": 9.5,
  "studentPhoto": "image.jpg"
}
```
### Delete a Student
### DELETE /delete/{id}
Deletes a student record by ID.

## Thymeleaf Interface
StudentRegister also includes a Thymeleaf-based frontend for managing students visually through a simple and responsive web UI.
You can:
* View all students in a list
* Create new records via an HTML form
* Edit or delete existing records

Access it at:
http://localhost:8080/student/ui

## Swagger API Documentation
This project includes Swagger UI for exploring and testing the API.
Once the application is running, you can open the documentation at:
http://localhost:8080/swagger-ui.html

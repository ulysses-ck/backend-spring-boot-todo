# Todo App API REST

This project is a backend implementation for a Todo application. It is designed as a training repository to practice and enhance skills in Java and Spring Boot development.

## Tech Stack

- **Java 21**: The programming language used for the backend.
- **Spring Boot**: Framework for building the REST API.
  - Spring Boot Actuator
  - Spring Boot Data JPA
  - Spring Boot Data REST
  - Spring Boot DevTools
- **H2 Database**: In-memory database for development and testing.
- **PostgreSQL**: Relational database for production.
- **Lombok**: To reduce boilerplate code.
- **Liquibase**: For database migrations.
- **SpringDoc OpenAPI**: For API documentation.
- **Spring Dotenv**: For environment variable management.

## Features

- RESTful API for managing todos.
- CRUD operations for todos.
- Database migration support with Liquibase.
- OpenAPI documentation for the API.

## Getting Started

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd backend-spring-boot-todo
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
   
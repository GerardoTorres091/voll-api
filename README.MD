# Voll API – RESTful Web Service

A Spring Boot REST API for managing patients, doctors, and appointments in a fictional medical clinic system.

> Deployed on AWS EC2 + RDS with CI/CD using GitHub Actions

---

## Live Demo

- **Swagger UI**: [http://3.141.196.32:8080/swagger-ui/index.html](http://3.141.196.32:8080/swagger-ui/index.html)

---

## Technologies Used

- Java 17
- Spring Boot 3.4.4
- Spring Security (JWT)
- Spring Data JPA (Hibernate)
- Flyway for DB migrations (MySQL)
- Maven
- Swagger / OpenAPI (`springdoc-openapi`)
- MySQL 8 on AWS RDS
- GitHub Actions (CI/CD)
- AWS EC2 (Ubuntu / Rocky Linux)

---

## Project Structure

```
src
└── main
    └── java
        └── med.voll.api
            ├── controller               # REST endpoints
            ├── domain                   # Models and DTOs
            ├── infra
            │   ├── errores              # Global exception handling
            │   ├── security             # JWT config and filters
            │   └── springdoc            # Swagger config
            └── ApiApplication.java      # Main entry point
```

---

## Authentication

This API uses **JWT-based authentication**.

### How to use:

1. Authenticate via `POST /login` using valid credentials.
2. Copy the `token` from the response.
3. Use it in the `Authorization` header like this:

```
Authorization: Bearer <your-token-here>
```

Protected endpoints (e.g., `/medicos`, `/pacientes`) require this token.

---

## CI/CD – GitHub Actions

Every push to the `main` branch automatically:

1. Builds the application with Maven
2. Uploads the JAR to AWS EC2
3. Restarts the backend with the latest environment variables

### GitHub Actions Workflow (simplified):

```yaml
on:
  push:
    branches: [ "main" ]

jobs:
  build-and-deploy:
    steps:
      - checkout
      - setup-java
      - build with Maven
      - ssh + scp deploy to EC2
```

> Environment variables like DB URL, credentials, and JWT secret are securely managed via GitHub `secrets`.

---

## Running Locally

To run the app:

```bash
./mvnw spring-boot:run
```

To build and run the JAR:

```bash
./mvnw clean package
java -jar target/api-0.0.1-SNAPSHOT.jar
```

---

## Running Tests

```bash
./mvnw test
```

---

## License

This project is licensed under the MIT License.
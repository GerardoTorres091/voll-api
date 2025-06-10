# Voll API – RESTful Web Service

A Spring Boot REST API for managing patients, doctors, and appointments in a fictional medical clinic system.

## Technologies Used

- Java 17
- Spring Boot 3.4.4
- Spring Security
- Spring Data JPA
- Flyway (MySQL migrations)
- JWT Authentication (Auth0 Java JWT)
- Swagger / OpenAPI (springdoc-openapi)
- Maven

## Project Structure

```
src
└── main
    └── java
        └── med.voll.api
            ├── controller               # REST controllers
            │   ├── AutenticacionController
            │   ├── ConsultaController
            │   ├── HelloController
            │   ├── MedicoController
            │   └── PacienteController
            ├── domain                   # Domain models
            │   ├── consulta
            │   ├── direccion
            │   ├── medico
            │   ├── paciente
            │   └── usuarios
            ├── infra
            │   ├── errores              # Global exception handling
            │   ├── security             # Security config and filters
            │   └── springdoc            # Swagger config
            └── ApiApplication.java      # Main application entry point
```

## Authentication

This API uses **JWT-based authentication**. To test secured endpoints:
1. Authenticate using `/login` with valid credentials.
2. Use the returned token as a Bearer Token in the `Authorization` header.

Example:
```
Authorization: Bearer eyJhbGciOiJIUzI1NiIs...
```

## API Documentation

Available at:  
`http://localhost:8080/swagger-ui.html`

## Running Tests

```bash
./mvnw test
```

## Build and Run

To run the application:

```bash
./mvnw spring-boot:run
```

To build the jar:

```bash
./mvnw clean package
java -jar target/api-0.0.1-SNAPSHOT.jar
```

## License

This project is licensed under the MIT License.

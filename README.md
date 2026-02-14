# CTSE Lab 03 – Product Service

## Project Description

This is a Spring Boot microservice application developed for CTSE Lab 03. The Product Service provides RESTful APIs for managing product information using a layered architecture pattern. The application demonstrates the implementation of a complete CRUD system with proper separation of concerns.

## Technologies Used

- **Java** - Programming Language
- **Spring Boot** - Application Framework
- **Spring Data JPA** - Data Persistence
- **Maven** - Dependency Management & Build Tool
- **REST API** - Communication Protocol
- **H2/MySQL** - Database

## Project Structure

```
src/main/java
├── controller/     # REST API endpoints
├── service/        # Business logic layer
├── repository/     # Data access layer
└── model/          # Entity classes
```

## How to Run the Project

### Prerequisites

- Java 17 or higher
- Maven 3.6+

### Steps

1. Clone the repository
   ```bash
   git clone <repository-url>
   cd product-service
   ```

2. Build the project
   ```bash
   mvn clean install
   ```

3. Run the application
   ```bash
   mvn spring-boot:run
   ```

4. Access the application
    - Application runs on: http://localhost:8080

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/products | Get all products |
| GET | /api/products/{id} | Get product by ID |
| POST | /api/products | Create new product |
| PUT | /api/products/{id} | Update existing product |
| DELETE | /api/products/{id} | Delete product |

## Sample JSON Request/Response

### Create Product (POST)

**Request:**
```json
{
  "name": "Laptop",
  "description": "Dell Inspiron 15",
  "price": 45000.00,
  "quantity": 10
}
```

**Response:**
```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Inspiron 15",
  "price": 45000.00,
  "quantity": 10,
  "createdAt": "2025-01-15T10:30:00"
}
```

### Get All Products (GET)

**Response:**
```json
[
  {
    "id": 1,
    "name": "Laptop",
    "description": "Dell Inspiron 15",
    "price": 45000.00,
    "quantity": 10
  },
  {
    "id": 2,
    "name": "Mouse",
    "description": "Wireless Mouse",
    "price": 1500.00,
    "quantity": 50
  }
]
```

## Future Improvements

- Add pagination and sorting for product listing
- Implement search and filter functionality
- Add input validation and exception handling
- Integrate with external payment gateway
- Implement JWT authentication and authorization
- Add unit and integration tests
- Configure Docker containerization
- Implement API documentation using Swagger/OpenAPI

## Author

**Miriyam Trishni**  
GitHub: [@miriyamtrishni](https://github.com/miriyamtrishni)

---

*This project is submitted as part of CTSE Lab 03 assignment.*

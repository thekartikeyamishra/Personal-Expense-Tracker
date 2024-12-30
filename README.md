# Personal Expense Tracker

A simple and practical **Personal Expense Tracker** application built with **Spring Boot**. This application allows users to track their expenses, categorize them, and generate reports.

---

## Features

1. **Expense Management**: Add, view, and delete expenses.
2. **Expense Categorization**: Group expenses into categories such as Food, Travel, and Shopping.
3. **Report Generation**: Generate reports for total expenses by category.
4. **In-Memory Database**: Uses H2 database for lightweight storage.
5. **RESTful APIs**: Exposes endpoints for easy interaction.

---

## Technology Stack

- **Java 17**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
  - H2 Database
  - DevTools
- **Maven**

---

## Prerequisites

1. **Java JDK 17 or higher**
2. **Maven**
3. **Visual Studio Code** with Java Extension Pack

---

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/thekartikeyamishra/Personal-Expense-Tracker
   cd expense-tracker
   ```

2. Import the project into your IDE (e.g., VSCode).

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the H2 Database Console:
   - URL: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:expensetrackerdb`

---

## API Endpoints

### 1. Add an Expense
**Request**: `POST /expenses`
**Body**:
```json
{
  "description": "Grocery Shopping",
  "category": "Food",
  "amount": 150.0
}
```
**Response**:
```json
{
  "id": 1,
  "description": "Grocery Shopping",
  "category": "Food",
  "amount": 150.0
}
```

### 2. Get All Expenses
**Request**: `GET /expenses`
**Response**:
```json
[
  {
    "id": 1,
    "description": "Grocery Shopping",
    "category": "Food",
    "amount": 150.0
  }
]
```

### 3. Get Expenses by Category
**Request**: `GET /expenses/category/{category}`
**Response**:
```json
[
  {
    "id": 1,
    "description": "Grocery Shopping",
    "category": "Food",
    "amount": 150.0
  }
]
```

### 4. Delete an Expense
**Request**: `DELETE /expenses/{id}`
**Response**: Status 204 (No Content)

---

## Configuration

### Default Configuration (`application.properties`):
```properties
spring.datasource.url=jdbc:h2:mem:expensetrackerdb
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---

## Enhancements

1. Add authentication and user management.
2. Integrate with an external database like PostgreSQL.
3. Create a front-end interface with React or Angular.
4. Implement analytics and visual reports using charting libraries.

---



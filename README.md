# Task-Manager-RESTful-API-using-Java
This is a simple RESTful API for managing tasks built with Java (Spring Boot) and MySQL. It allows you to perform CRUD (Create, Read, Update, Delete) operations on tasks. Each task has properties such as title, description, and status.

# Table of Contents
Description
Features
Prerequisites
Installation
Usage
API Endpoints
Contributing
License
Description
This is a simple RESTful API for managing tasks built with Java (Spring Boot) and MySQL. It allows you to perform CRUD (Create, Read, Update, Delete) operations on tasks. Each task has properties such as title, description, and status.

# Features
* Create a new task with title, description, and status.
* Read all tasks.
* Read a specific task by ID.
* Update the status of an existing task.
* Delete a task by ID.
 
# Prerequisites
* Before you begin, ensure you have met the following requirements:
* Java Development Kit (JDK) 8 or higher installed.
* Apache Maven for building the project.
* MySQL database server with a assignment.task database and task table set up. You can find the schema in the Database Setup section.

## API Endpoints

### Create a New Task

### Create a Task

```http
POST /tasks
Content-Type: application/json

{
  "title": "Sample Task",
  "description": "This is a sample task.",
  "status": "pending"
}
- **URL:** `/tasks`
- **Method:** `POST`
- **Description:** Create a new task.
- **Request Body:** JSON object with task details (title, description, status).
- **Response:**
  - Status Code: `201 Created`
  - Body: JSON representation of the created task.
 
### Get All Tasks

- **URL:** `/tasks`
- **Method:** `GET`
- **Description:** Fetch all tasks.
- **Response:**
  - Status Code: `200 OK`
  - Body: List of tasks in JSON format.

### Update Task Status

- **URL:** `/tasks/{id}`
- **Method:** `PUT`
- **Description:** Update the status of an existing task.
- **URL Parameters:**
  - `id` (Long): The unique identifier of the task.
- **Request Parameters:**
  - `status` (String): The new status for the task.
- **Response:**
  - Status Code: `200 OK`
  - Body: JSON representation of the updated task.

### Delete Task

- **URL:** `/tasks/{id}`
- **Method:** `DELETE`
- **Description:** Delete an existing task.
- **URL Parameters:**
  - `id` (Long): The unique identifier of the task.
- **Response:**
  - Status Code: `204 No Content`

## Getting Started

1. Clone this repository.

2. Configure your database in the `application.properties` or `application.yml` file.

3. Build and run the application using Maven or your preferred IDE.

4. Access the API using a tool like `curl` or a REST client like Postman.

## Example Requests

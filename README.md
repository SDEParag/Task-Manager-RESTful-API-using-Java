# Task-Manager-RESTful-API-using-Java
This is a simple RESTful API for managing tasks built with Java (Spring Boot) and MySQL. It allows you to perform CRUD (Create, Read, Update, Delete) operations on tasks. Each task has properties such as title, description, and status.

# Table of Contents
* Features
* Prerequisites
* Installation
* Usage
* API Endpoints

# Features
* Create a new task with title, description, and status.
* Read all tasks.
* Update the status of an existing task  by ID.
* Delete a task by ID.
 
# Prerequisites
* Before you begin, ensure you have met the following requirements:
* Java Development Kit (JDK) 8 or higher installed.
* Apache Maven for building the project.
* MySQL database server with a assignment.task database and task table set up. You can find the schema in the Database Setup section.

# Installation
Clone the repository:

shell
Copy code
git clone https://github.com/your-username/task-manager-api.git
Navigate to the project directory:

shell
Copy code
cd task-manager-api
Build the project using Maven:

shell
Copy code
mvn clean install
Run the Spring Boot application:

shell
Copy code
mvn spring-boot:run
Usage
Once the application is running, you can use tools like Postman to interact with the API. The API will be available at http://localhost:8080/tasks. Refer to the API Endpoints section for details on available endpoints and how to use them.



# API Endpoints

### Create a Task

```http
- Method: `POST` : http://localhost:8080/tasks
Select -> Body -> Row -> JSON

{
    "title": "Task 1",
    "description": "Description for Task 1",
    "status": "pending"
}

- Response:
{
    "id": 1,
    "title": "Task 1",
    "description": "Description for Task 1",
    "status": "pending"
}
  - Status Code: `201 Created`
  - Body: JSON representation of the created task.
```

### Get All Tasks
* Description: Fetch all tasks.
```http
 Method:  `GET` : http://localhost:8080/tasks

- Response:
{
        "id": 1,
        "title": "Task 1",
        "description": "Description for Task 1",
        "status": "pending"
}

  - Status Code: `200 OK`
  - Body: List of tasks in JSON format.

```

### Update Task Status
* Description: Update the status of an existing task.
* URL Parameters:
   - `id` (Long): The unique identifier of the task.
   
 * Request Parameters:
   - `status` (String): The new status for the task.

```http
- Method: `PUT` : http://localhost:8080/tasks/1
Select -> Body -> Row -> JSON

{
    "status": "completed"
}

- Response:

{
    "title": "Task 1",
    "description": "Description for Task 1",
    "status": "completed"
}

  - Status Code: `200 OK`
  - Body: JSON representation of the updated task.
```

### Delete Task
* Description: Delete an existing task.
```http
- Method: `DELETE`: http://localhost:8080/tasks/1

- URL Parameters:
  - `id` (Long): The unique identifier of the task.

- Response:
  - Status Code: `204 No Content`
```

# Getting Started

1. Clone this repository.

2. Configure your database in the application.properties.

3. Build and run the application using Maven or your preferred IDE.

4. Access the API using a tool Postman to Test The Rest API Point.

## Example Requests

📋 Task Management Application – Project Description

✅ Overview

This is a simple Task Management System built using Java and Spring Boot. It allows users to perform basic CRUD (Create, Read, Update, Delete) operations on tasks using a RESTful API.

🏗️ Core Features

Create a Task – Add new tasks with title, description, and status.
Read Tasks – View all existing tasks or fetch a task by its ID.
Update Tasks – Modify the title, description, or status of an existing task.
Delete Tasks – Remove a task from the system.

🧩 Technologies Used

Java
Spring Boot
Maven
Postman (for testing the API)
GitHub (for version control)

🗂️ Project Structure

Task.java – Model class representing a task (with ID, title, description, status).
Status.java – Enum defining allowed task statuses (e.g., TODO, IN_PROGRESS, DONE).
TaskController.java – REST controller exposing task-related endpoints.
TaskService.java – Business logic for managing tasks.

🌐 Example API Endpoints

Method	Endpoint	Description
GET	/tasks  	Get all tasks
GET	/tasks/{id}	Get task by ID
POST	/tasks	        Create a new task
PUT	/tasks/{id}	Update an existing task
DELETE	/tasks/{id}	Delete a task by ID

🧪 Testing

You can use Postman to test the endpoints by sending JSON requests like:

🟢 Create Task (POST /tasks)
{
  "id": 91,
  "title": "Finish API integration",
  "description": "Integrate the task API with frontend",
  "status": "IN_PROGRESS"
}

🟠 Update Task (PUT /tasks/91)
{
  "id": 91,
  "title": "Update API docs",
  "description": "Updated the API usage documentation",
  "status": "DONE"
}

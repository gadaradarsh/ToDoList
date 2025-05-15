#To-Do List Application

This is a simple To-Do List Application built using Spring Boot and Thymeleaf. The application allows users to add and delete tasks using a unique task number as a primary key.

Features

📌 Add Tasks with a task number, name, and description

🗑️ Delete Tasks using a delete button next to each task

🖥️ Web Interface using Thymeleaf for dynamic rendering

📂 Spring Boot Backend for managing task data

Technologies Used

Spring Boot (Java framework)

Thymeleaf (for HTML templating)

CSS (for styling)

Java (backend logic)

Installation & Setup

1️⃣ Clone the Repository

    git clone https://github.com/your-username/todo-list-springboot.git
    cd todo-list-springboot

2️⃣ Run the Application

Ensure you have Java 17+ and Maven installed, then run:

    mvn spring-boot:run

3️⃣ Open in Browser

Once the application is running, open:

    http://localhost:8080/home

Usage

Click "Add Task" to enter a new task with a task number

Tasks will be displayed on the home page

Click "Delete" next to any task to remove it

Project Structure

📦 todo-list-springboot
 ┣ 📂 src/main/java/com/todo/controller<br>
 ┃ ┣ 📜 ToDoController.java<br>
 ┣ 📂 src/main/java/com/todo/model<br>
 ┃ ┣ 📜 ToDoModel.java<br>
 ┣ 📂 src/main/resources/templates<br>
 ┃ ┣ 📜 home.html<br>
 ┃ ┣ 📜 addtodo.html<br>
 ┣ 📜 application.properties<br>
 ┗ 📜 pom.xml<br>

Contributions

Feel free to fork and contribute! Open a pull request with any improvements.

License

This project is licensed for free for personal and commercial use. See LICENSE for details

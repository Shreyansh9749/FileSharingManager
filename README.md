# File Sharing Manager

It is a simple file sharing app where you can upload your file and share a link of it to another user who can open the link and download the file in a much simpler and fast way.
# 📁 File Sharing Manager

A web-based file sharing application that allows users to log in using GitHub or Google, upload files, generate shareable links, and automatically delete files after 24 hours. Built with Java, Spring Boot, MySQL, and a responsive HTML/CSS/JavaScript frontend.

---

## 🚀 Features

- 🔐 **OAuth Login** – Login via GitHub or Google (OAuth 2.0)
- 📤 **File Upload** – Upload files via a simple UI
- ⏱️ **Auto-Delete** – Files are automatically removed after 24 hours
- 🔗 **Sharing** – Shareable links with download functionality
- 📜 **File Listing** – View uploaded files in a session
- 🛡️ **Secure Access** – Token-based access control for file downloads

---

## 🧰 Tech Stack

### Frontend:
- HTML5
- CSS3
- JavaScript (ES6+)

### Backend:
- Java 17
- Spring Boot
- Spring Security
- OAuth 2.0
- RESTful APIs

### Database:
- MySQL 8.x

### Tools & Others:
- IntelliJ IDEA / VS Code
- Postman (for API testing)
- Git & GitHub
- Apache Tomcat / Docker (optional)

---

## ⚙️ Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Shreyansh9749/filesharingmanager.git
   cd filesharingmanager
   
2.  Configure application.properties Set up your database and OAuth credentials in src/main/resources/application.properties.

3. Database Setup

Create a MySQL database: testdb

Run the schema (if provided) or allow JPA to auto-generate tables.

4. Run the Application

5. Access the App Open http://localhost:8080 in your browser.

📦 Future Improvements
Mobile app integration (Flutter or React Native)

File preview (PDF/Image) before downloading

Cloud storage integration (e.g., AWS S3)

Role-based access and admin dashboard

Expiry time customization

here's the demo screenshot of the project

![image](https://github.com/user-attachments/assets/c2a8ddfa-c032-4272-877a-637250491546)
![image](https://github.com/user-attachments/assets/2b65e97f-68a1-4e7b-bb70-ac3aea902989)
![image](https://github.com/user-attachments/assets/3d9d0ade-fa1e-48b5-83e4-5cab07227fbe)
![image](https://github.com/user-attachments/assets/754c1bce-0057-4197-85d0-dc42456c089b)
![image](https://github.com/user-attachments/assets/8e1b293c-2f1d-4eb2-8dbc-73ceb3a3fb7e)
![image](https://github.com/user-attachments/assets/12bc0ec5-261c-48d1-a0f2-97e2c2fc5a7b)
![image](https://github.com/user-attachments/assets/f2902730-c513-4940-a454-9ff1188171ca)
![image](https://github.com/user-attachments/assets/814397b3-6f6d-49de-bf4d-fe3b5c59d15a)
![image](https://github.com/user-attachments/assets/f9ce77e1-222d-477d-be78-5fd004f80bc6)

we have to create only a testdb in MySQL

also in appconfig file you have to put your MySQL password

we have used Thymleaf in front end also.

it is a maven based project all dependencies are present in the pom.xml file of the project.

*** This Project is not hosted yet

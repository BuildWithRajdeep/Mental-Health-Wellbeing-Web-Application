# 🧠 Mental Health Wellbeing Web Application

## Overview
This is a full-stack Java-based web application for mental health awareness and support. It includes user registration, login, stress level evaluation, chatbot support, and professional suggestions.

## Features
- Java Servlets backend with MySQL integration
- HTML/CSS frontend with calming UI
- Chatbot support using JS + Servlet
- Stress levels from mild to severe with personalized suggestions

## Technologies Used
- Java Servlet, JSP
- MySQL DB
- HTML5, CSS3, JavaScript
- Apache Tomcat

## Setup Instructions

### 🛠️ Prerequisites
- Java JDK 11+
- Apache Tomcat 9/10
- MySQL Server
- Eclipse IDE (or IntelliJ)
- Git

### 🚀 How to Run

1. **Clone the Repository**
```bash
git clone https://github.com/YOUR_USERNAME/MentalHealthApp.git
cd MentalHealthApp
```

2. **Setup MySQL DB**
Run `SQL/database.sql` in MySQL Workbench or terminal to create tables and insert data.

3. **Import Project into Eclipse**
- File > New > Dynamic Web Project > Import the source files
- Add servlet mappings in `web.xml`

4. **Run on Server**
Right click > Run on Server > Apache Tomcat

5. **Access Web App**
Open [http://localhost:8080/MentalHealthApp/Frontend/index.html](http://localhost:8080/MentalHealthApp/Frontend/index.html)

### 📦 Deployment Tips
- Secure passwords using hashing (e.g., BCrypt)
- Deploy on cloud with Docker or Spring Boot

---

## License
MIT License

> Developed as part of a college project for mental health awareness ❤️
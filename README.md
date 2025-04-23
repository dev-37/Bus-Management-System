# 🚍 Bus Management System

A **Spring MVC-based web application** for managing buses, built using **Java**, **Spring MVC**, **JSP**, and **MySQL**. This project performs basic **CRUD operations** and includes a simple **bus search** feature by location.

---

## Tech Stack

- Programming: Java 17
- Frameworks: Spring MVC, Hibernate
- Frontend: JSP, HTML, CSS
- Database: MySQL
- Build tool: Maven
- Server: Apache Tomcat 10.1
- IDE: Eclipse

---

## Features

- Add a new bus  
- Edit bus details  
- Delete a bus  
- Search available buses by location  
- View all buses in a table layout  

> No login/authentication implemented

---

## Project Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/dev-37/Bus-Management-System.git
   ```

2. **Open in Eclipse**
   - File > Import > Existing Maven Project
   - Select the cloned project folder

3. **Database Setup**
   - Create a new MySQL database (e.g., `busdb`)
   - Run the SQL file located in `sql/bus.sql`
   - Update your DB credentials inside `resources/application.properties` or relevant config

4. **Run the project**
   - Deploy on Tomcat server from Eclipse or manually deploy on to your Tomcat server
   - Visit: `http://localhost:8080/busOperator/`

---

## Learnings

- Hands-on practice with **Spring MVC architecture**  
- Managed JSP-based forms and responses  
- Performed **CRUD operations** using MySQL  
- Used **ModelAndView**, form binding, and `@Controller` effectively

---

## Future Improvements

- Add user/admin authentication  
- Schedule management for buses  
- Booking system with seat selection  

---

## SQL File

See [sql/bus.sql](sql/bus.sql) for table creation

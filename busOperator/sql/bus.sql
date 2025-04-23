CREATE DATABASE IF NOT EXISTS busdb;
USE busdb;

CREATE TABLE buses (
    bus_id INT PRIMARY KEY AUTO_INCREMENT,
    bus_name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    ticket_price INT NOT NULL
);
